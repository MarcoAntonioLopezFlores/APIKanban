package mx.edu.utez.apikanban.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utez.apikanban.entity.ProductBacklogEntity;
import mx.edu.utez.apikanban.repository.ProductBacklogRepository;

@Service
public class ProductBacklogService {

	@Autowired
	private ProductBacklogRepository productBacklogRepository;
	
	
	public List<ProductBacklogEntity> getAllProductBacklog(){
		return productBacklogRepository.findAll();
	}
	
	
	public ProductBacklogEntity saveProductBacklog(ProductBacklogEntity productBacklog) {
		productBacklogRepository.save(productBacklog);
		return productBacklogRepository.save(productBacklog);
	}
	
	
	public ProductBacklogEntity updateProductBacklog(ProductBacklogEntity productBacklog) {
		productBacklogRepository.save(productBacklog);
		return productBacklogRepository.save(productBacklog);
	}
}
