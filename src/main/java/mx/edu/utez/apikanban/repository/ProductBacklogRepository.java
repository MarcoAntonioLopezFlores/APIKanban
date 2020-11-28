package mx.edu.utez.apikanban.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.edu.utez.apikanban.entity.ProductBacklogEntity;
import mx.edu.utez.apikanban.entity.ProjectEntity;


@Repository
public interface ProductBacklogRepository extends JpaRepository<ProductBacklogEntity, Long> {
	List<ProductBacklogEntity> findAllByProject(ProjectEntity project);
}
