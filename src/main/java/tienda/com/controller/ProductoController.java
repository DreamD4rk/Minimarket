package tienda.com.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tienda.com.modelo.Producto;
import tienda.com.services.ProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	public ProductoController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/listar")
	public ResponseEntity<?> lista_GET(){
		Collection<Producto> productoDb = productoService.findAll();
		if(productoDb.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(productoDb, HttpStatus.OK);
	}

}
