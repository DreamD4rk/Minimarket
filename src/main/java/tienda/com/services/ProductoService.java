package tienda.com.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import tienda.com.modelo.Producto;

public interface ProductoService {
	
	public abstract Integer save(Producto producto);
	public abstract void delete(Integer id_prod);
	public abstract Producto finfById(Integer id_prod);
	public abstract List<Producto> findAll();
	Page<Producto> getAll(Pageable page);
}
