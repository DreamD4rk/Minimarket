package tienda.com.services;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import tienda.com.modelo.Producto;
import tienda.com.repositorio.ProductoRepositorio;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoRepositorio productoRepositorio;
	
	@Override
	public Integer save(Producto producto) {
		int res = 0;
		Producto pro=productoRepositorio.save(producto);
		if(pro != null) {
			res =1;
		}
		return res;
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
	public List<Producto> findAll() {
		return productoRepositorio.findAll();
	}

	@Override
	public Page<Producto> getAll(Pageable page) {
		// TODO Auto-generated method stub
		return productoRepositorio.findAll(page);
	}

}
