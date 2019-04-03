package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entities.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	
	public abstract Usuario findByIdUsuario (long idUsuario);
	
	public abstract Usuario findByIdUsuarioAndClaveUsuario (long idUsuario, String claveUsuario);
}
