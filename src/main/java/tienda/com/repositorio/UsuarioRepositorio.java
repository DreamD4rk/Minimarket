package tienda.com.repositorio;

import org.springframework.data.repository.CrudRepository;

import tienda.com.modelo.Usuario;

public interface UsuarioRepositorio extends CrudRepository<Usuario, Integer> {

}
