package tienda.com.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tienda.com.modelo.Rol;

@Repository
public interface RolRepository extends CrudRepository<Rol, Integer> {

}
