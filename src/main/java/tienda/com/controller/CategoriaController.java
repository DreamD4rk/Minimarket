package tienda.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tienda.com.modelo.Categoria;
import tienda.com.modelo.Marca;
import tienda.com.modelo.Clientes;
import tienda.com.repositorio.CategoriaRepository;

@CrossOrigin(origins = {"http://localhost:4200","*"},allowedHeaders = "*")
@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired private CategoriaRepository data;
	
	@GetMapping("")
	public ResponseEntity<List<Categoria>> listar(){
		List<Categoria > cat=data.findAll();
		return new ResponseEntity<List<Categoria>>(cat,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> buscar(@PathVariable Integer id){
		Categoria cat=data.findById(id).orElse(null);
		return new ResponseEntity(cat,HttpStatus.OK);
	}
	
	@PostMapping("")
	public ResponseEntity<?> agregar(@RequestBody Categoria categoria){
		return new ResponseEntity(data.save(categoria),HttpStatus.OK);
	}
}
