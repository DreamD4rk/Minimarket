package tienda.com.service;

import java.util.Collection;

import tienda.com.model.Usuario;
import tienda.com.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
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
	public void delete(Integer id) {
		usurepository.deleteById(id);
	}

	@Override
	@Transactional
	public Usuario findById(Integer id) {
		return usurepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Collection<Usuario> findAll() {
		return (Collection<Usuario>)usurepository.findAll();
	}

}
