package tienda.com.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tienda.com.modelo.Producto;
import tienda.com.repositorio.ProductoRepositorio;

@Service
public class ProdcutoServiceImpl implements ProductoService{

	@Autowired
	private ProductoRepositorio productoRepositorio;
	
	@Override
	public void insert(Producto producto) {
		productoRepositorio.save(producto);
	}

	@Override
	public void update(Producto producto) {
		productoRepositorio.save(producto);
	}

	@Override
	public void delete(Integer id_prod) {
		productoRepositorio.deleteById(id_prod);
	}

	@Override
	public Producto finfById(Integer id_prod) {
		return productoRepositorio.findById(id_prod).orElse(null);
	}

	@Override
	public Collection<Producto> findAll() {
		return (Collection<Producto>) productoRepositorio.findAll();
	}

}
