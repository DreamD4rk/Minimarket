package tienda.com.services;

import tienda.com.model.Usuario;

import java.util.Collection;

public interface UsuarioService {

	public abstract void insert (Usuario user);
	public abstract void update (Usuario user);
	public abstract void delete (Integer id);
	public abstract Usuario findById(Integer id);
	public abstract Collection<Usuario> findAll();
}
