package tienda.com.controller;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tienda.com.modelo.Producto;
import tienda.com.services.ProductoService;

@CrossOrigin(origins = {"http://localhost:4200",""})
@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired private ProductoService productoService;
	
	@GetMapping("")
	public ResponseEntity<List<Producto>> listar(){
		List<Producto> lista = productoService.findAll();
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/list")
	public Page<Producto> findAll(@RequestParam(defaultValue = "0") int page) {
		return productoService.getAll(new QPageRequest(page, 4));
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Producto> buscar(@PathVariable Integer id){
		Producto pro = productoService.finfById(id);
		if(pro == null) {
			return new ResponseEntity<Producto>(pro,HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Producto>(pro,HttpStatus.OK);
	}

	@PostMapping("")
	public ResponseEntity<Integer> agregar(@RequestBody Producto producto){
		Integer res = productoService.save(producto);
		if(res == 0) {
			return new ResponseEntity<Integer>(res,HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Integer>(res,HttpStatus.OK);
	}
	
	@PutMapping("")
	public ResponseEntity<Integer> update(@RequestBody Producto producto){
		Integer res = productoService.save(producto);
		if(res == 0) {
			return new ResponseEntity<Integer>(res,HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Integer>(res,HttpStatus.OK);
	}
	
}
