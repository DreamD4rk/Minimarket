package tienda.com.controller;

import tienda.com.model.Producto;
import tienda.com.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;

	@GetMapping("/listar")
	public ResponseEntity<?> lista_GET(){
		Collection<Producto> productoDb = productoService.findAll();
		if(productoDb.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(productoDb, HttpStatus.OK);
	}

}
