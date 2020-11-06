package mx.edu.utez.apikanban.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.apikanban.entity.ProjectEntity;
import mx.edu.utez.apikanban.service.ProjectService;



@RestController
@RequestMapping("/APIKanban/project")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST})
public class ProjectController {
	@Autowired
	private ProjectService projectService;
	
	@GetMapping("/lista")
	public List<ProjectEntity> getAllProject(){
		return projectService.getAllProject();
	}
	
	@PostMapping("/registrar")
	public ProjectEntity saveProject(@RequestBody ProjectEntity project) {
		
		return projectService.saveProject(project);
	}
	
	@PutMapping("/actualizar")
	public ProjectEntity updateProject(@RequestBody ProjectEntity project) {
		
		return projectService.saveProject(project);
	}
}
