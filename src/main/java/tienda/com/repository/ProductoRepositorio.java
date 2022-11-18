package tienda.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tienda.com.model.Producto;

import java.util.List;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Integer>{
	List<Producto> findByCategoriaNombre(String nombre);
}
