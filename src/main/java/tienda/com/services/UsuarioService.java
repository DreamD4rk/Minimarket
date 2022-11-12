package tienda.com.services;

import java.util.Collection;

import tienda.com.modelo.Usuario;

public interface UsuarioService {

	public abstract void insert (Usuario user);
	public abstract void update (Usuario user);
	public abstract void delete (Integer id_usu);
	public abstract Usuario findById(Integer id_usu);
	public abstract Collection<Usuario> findAll();
}
