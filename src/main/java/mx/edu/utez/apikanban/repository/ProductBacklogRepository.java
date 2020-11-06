package mx.edu.utez.apikanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.edu.utez.apikanban.entity.ProductBacklogEntity;


@Repository
public interface ProductBacklogRepository extends JpaRepository<ProductBacklogEntity, Long> {

}
