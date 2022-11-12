package tienda.com.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import tienda.com.modelo.Usuario;
import tienda.com.repositorio.UsuarioRepositorio;

public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepositorio usurepository;
	
	@Override
	@Transactional
	public void insert(Usuario user) {
		usurepository.save(user);
	}

	@Override
	@Transactional
	public void update(Usuario user) {
		usurepository.save(user);
	}

	@Override
	@Transactional
	public void delete(Integer id_usu) {
		usurepository.deleteById(id_usu);
	}

	@Override
	@Transactional
	public Usuario findById(Integer id_usu) {
		return usurepository.findById(id_usu).orElse(null);
	}

	@Override
	@Transactional
	public Collection<Usuario> findAll() {
		return (Collection<Usuario>)usurepository.findAll();
	}

}
