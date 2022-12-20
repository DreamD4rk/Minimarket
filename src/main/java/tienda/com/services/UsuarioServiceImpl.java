package tienda.com.services;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tienda.com.modelo.Usuario;
import tienda.com.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepositorio usurepository;
	
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
	public List<Usuario> findAll() {
		return usurepository.findAll();
	}

	@Override
	public Usuario iniciarSesion(String username, String password) {
		return usurepository.findByUsernameAndPassword(username, password);
	}

	@Override
	public Page<Usuario> pageAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return pageAll(pageable);
	}

	@Override
	public int guardar(Usuario user) {
		// TODO Auto-generated method stub
		int res = 0;
		Usuario usu = usurepository.save(user);
		if(usu != null) {
			res =1;
		}
		return res;
	}

}
