package tienda.com.services;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import tienda.com.modelo.Clientes;

public interface UsuarioService {

	public abstract int guardar (Clientes user);
	public abstract void delete (Integer id_usu);
	public abstract Clientes findById(Integer id_usu);
	public abstract List<Clientes> findAll();
	public abstract Clientes iniciarSesion(String username,String password);
	public abstract Page<Clientes> pageAll(Pageable pageable);
}
