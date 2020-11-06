package mx.edu.utez.apikanban.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import mx.edu.utez.apikanban.entity.ProjectEntity;
import mx.edu.utez.apikanban.repository.ProjectRepository;



@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	
	public List<ProjectEntity> getAllProject(){
		return projectRepository.findAll();
	}
	
	
	public ProjectEntity saveProject(ProjectEntity project) {
		
		return projectRepository.save(project);
	}
	
	
	public ProjectEntity updateProject(ProjectEntity project) {
		
		return projectRepository.save(project);
	}
}
