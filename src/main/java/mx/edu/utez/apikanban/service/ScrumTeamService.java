package mx.edu.utez.apikanban.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utez.apikanban.entity.ScrumTeamEntity;
import mx.edu.utez.apikanban.repository.ScrumTeamRepository;

@Service
public class ScrumTeamService {

	@Autowired
	private ScrumTeamRepository scrumTeamRepository;
	
		
		public List<ScrumTeamEntity> getScrumTeamList(){
			return scrumTeamRepository.findAll();
		}
		
		
		public ScrumTeamEntity saveScrumTeam(ScrumTeamEntity scrumTeam){
			
			return scrumTeamRepository.save(scrumTeam);
		}
		
		public ScrumTeamEntity updateScrumTeam(ScrumTeamEntity scrumTeam) {
			
			return scrumTeamRepository.save(scrumTeam);
		}
}
