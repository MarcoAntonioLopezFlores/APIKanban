package mx.edu.utez.apikanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.edu.utez.apikanban.entity.ScrumTeamEntity;


@Repository
public interface ScrumTeamRepository extends JpaRepository<ScrumTeamEntity, Long>{

}
