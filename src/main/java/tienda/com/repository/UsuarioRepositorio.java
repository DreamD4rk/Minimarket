package tienda.com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tienda.com.model.Usuario;

@Repository
public interface UsuarioRepositorio extends CrudRepository<Usuario, Integer> {

}
