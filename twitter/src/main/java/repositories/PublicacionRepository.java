package repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entities.Publicacion;

@Repository
public interface PublicacionRepository extends CrudRepository<Publicacion, Long>{

		
}