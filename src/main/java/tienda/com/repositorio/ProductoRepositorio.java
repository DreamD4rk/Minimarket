package tienda.com.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tienda.com.modelo.Producto;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Integer>{
	List<Producto> findByCategoriaNombre(String nombre);
}
