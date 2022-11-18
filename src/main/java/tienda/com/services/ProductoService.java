package tienda.com.services;

import tienda.com.model.Producto;

import java.util.Collection;

public interface ProductoService {
	
	public abstract void insert(Producto producto);
	public abstract void update(Producto producto);
	public abstract void delete(Integer id);
	public abstract Producto findById(Integer id);
	public abstract Collection<Producto> findAll();

}
