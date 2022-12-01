package tienda.com.services;

import java.util.List;

import tienda.com.modelo.Producto;

public interface ProductoService {
	
	public abstract Integer save(Producto producto);
	public abstract void delete(Integer id_prod);
	public abstract Producto finfById(Integer id_prod);
	public abstract List<Producto> findAll();

}
