package mx.edu.utez.apikanban.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.edu.utez.apikanban.entity.ProjectEntity;
import mx.edu.utez.apikanban.entity.ScrumTeamEntity;


@Repository
public interface ScrumTeamRepository extends JpaRepository<ScrumTeamEntity, Long>{
	List<ScrumTeamEntity> findAllByProject(ProjectEntity project);
	List<ScrumTeamEntity> findByRolAndProject(int rol, ProjectEntity project);
}
