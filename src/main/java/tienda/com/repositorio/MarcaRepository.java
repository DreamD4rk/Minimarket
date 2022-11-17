package tienda.com.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tienda.com.modelo.Marca;

@Repository
public interface MarcaRepository extends CrudRepository<Marca, Integer> {

}
