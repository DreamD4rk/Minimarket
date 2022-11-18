package tienda.com.services;

import tienda.com.model.Producto;
import tienda.com.repository.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProductoServiceImpl implements ProductoService{

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
	public void delete(Integer id) {
		productoRepositorio.deleteById(id);
	}

	@Override
	public Producto findById(Integer id) {
		return productoRepositorio.findById(id).orElse(null);
	}

	@Override
	public Collection<Producto> findAll() {
		return productoRepositorio.findAll();
	}

}
