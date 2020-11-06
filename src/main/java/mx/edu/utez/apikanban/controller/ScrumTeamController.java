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

import mx.edu.utez.apikanban.entity.ScrumTeamEntity;
import mx.edu.utez.apikanban.service.ScrumTeamService;


@RestController
@RequestMapping("/APIKanban/team")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST})
public class ScrumTeamController {
	@Autowired
	private ScrumTeamService scrumTeamService;
	
		@GetMapping("/lista")
		public List<ScrumTeamEntity> getScrumTeamList(){
			return scrumTeamService.getScrumTeamList();
		}
		
		@PostMapping("/registrar")
		public ScrumTeamEntity saveScrumTeam(@RequestBody ScrumTeamEntity scrumTeam){
			
			return scrumTeamService.saveScrumTeam(scrumTeam);
		}
		@PutMapping("/actualizar")
		public ScrumTeamEntity updateScrumTeam(@RequestBody ScrumTeamEntity scrumTeam) {
			
			return scrumTeamService.updateScrumTeam(scrumTeam);
		}
}
