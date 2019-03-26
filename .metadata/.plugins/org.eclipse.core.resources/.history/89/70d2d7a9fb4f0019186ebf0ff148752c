package services;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import entities.Usuario;
import repositories.UsuarioRepository;

@RestController
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepositoryDAO;

	@CrossOrigin
	@RequestMapping(path = "/getAllUsers", method = RequestMethod.GET)
	public Iterable<Usuario> getAllUsers() {

		Iterable<Usuario> findAll = usuarioRepositoryDAO.findAll();
		return findAll;
	}

	@CrossOrigin
	@RequestMapping(path = "/addUser", method = RequestMethod.POST)
	public @ResponseBody String addNewUser(@RequestParam String nombreUsuario, @RequestParam String apellidoUsuario,
			@RequestParam String claveUsuario, @RequestParam String correoUsuario, @RequestParam String celularUsuario)
			throws ParseException {

		Usuario nuevoUsuario = new Usuario();
		nuevoUsuario.setNombreUsuario(nombreUsuario);
		nuevoUsuario.setApellidoUsuario(apellidoUsuario);
		nuevoUsuario.setClaveUsuario(claveUsuario);
		nuevoUsuario.setCorreoUsuario(correoUsuario);
		nuevoUsuario.setCelularUsuario(Long.valueOf(celularUsuario));

		usuarioRepositoryDAO.save(nuevoUsuario);
		return "Usuario Guardado";

	}
	
	@CrossOrigin
	@RequestMapping(path = "/getUser", method = RequestMethod.GET)
	public Usuario getUser(@RequestParam String id) {

		Usuario findUser = usuarioRepositoryDAO.findByIdUsuario(Long.valueOf(id));
		return findUser;
	}

}
