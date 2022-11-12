package tienda.com.services;

import java.util.Collection;

import tienda.com.modelo.Producto;

public interface ProductoService {
	
	public abstract void insert(Producto producto);
	public abstract void update(Producto producto);
	public abstract void delete(Integer id_prod);
	public abstract Producto finfById(Integer id_prod);
	public abstract Collection<Producto> findAll();

}
