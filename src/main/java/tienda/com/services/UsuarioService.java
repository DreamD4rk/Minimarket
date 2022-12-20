package tienda.com.services;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import tienda.com.modelo.Usuario;

public interface UsuarioService {

	public abstract int guardar (Usuario user);
	public abstract void delete (Integer id_usu);
	public abstract Usuario findById(Integer id_usu);
	public abstract List<Usuario> findAll();
	public abstract Usuario iniciarSesion(String username,String password);
	public abstract Page<Usuario> pageAll(Pageable pageable);
}
