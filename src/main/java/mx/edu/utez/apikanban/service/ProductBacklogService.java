package mx.edu.utez.apikanban.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utez.apikanban.entity.ProductBacklogEntity;
import mx.edu.utez.apikanban.entity.ProjectEntity;
import mx.edu.utez.apikanban.repository.ProductBacklogRepository;


@Service
public class ProductBacklogService {

	@Autowired
	private ProductBacklogRepository productBacklogRepository;
	@Autowired
	private ProjectService projectService;
	
	public List<ProductBacklogEntity> getAllProductBacklog(long idProject){
		ProjectEntity project = new ProjectEntity();
		project.setId(idProject);
		return productBacklogRepository.findAllByProject(project);
	}
	
	
	public ProductBacklogEntity saveProductBacklog(ProductBacklogEntity productBacklog) {
		if(getAllProductBacklog(productBacklog.getProject().getId()).size()==0) {
			ProjectEntity projectUpdateStatus = projectService.getOneProject(productBacklog.getProject().getId());
			projectUpdateStatus.setStatus("Seleccionado");
			projectUpdateStatus.setStatusDate(new Date());
			projectService.updateProject(projectUpdateStatus);	
		}	
		return productBacklogRepository.save(productBacklog);
	}
	
	public ProductBacklogEntity updateStatusProduct(ProductBacklogEntity productBacklog) {
		boolean firstFinished=true;
		productBacklog.setStatusDate(new Date());
		
		List<ProductBacklogEntity> products=getAllProductBacklog(productBacklog.getProject().getId());
		for (int i = 0; i < products.size(); i++) {
			if(products.get(i).getStatus()==4) {
				firstFinished=false;
				break;
			}
		}
		
		if(firstFinished && productBacklog.getStatus()==4) {
			ProjectEntity projectUpdateStatus = projectService.getOneProject(productBacklog.getProject().getId());
			projectUpdateStatus.setStatus("En proceso");
			projectUpdateStatus.setStatusDate(new Date());
		}
		
		return productBacklogRepository.save(productBacklog);
	}
	
	public ProductBacklogEntity updateProductBacklog(ProductBacklogEntity productBacklog) {				
		return productBacklogRepository.save(productBacklog);
	}
}
