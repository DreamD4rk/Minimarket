package tienda.com.repositorio;

import org.springframework.data.repository.CrudRepository;

import tienda.com.modelo.Producto;

public interface ProductoRepositorio extends CrudRepository<Producto, Integer>{

}
