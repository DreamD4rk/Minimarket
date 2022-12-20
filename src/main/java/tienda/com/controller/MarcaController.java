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
import tienda.com.repositorio.MarcaRepository;

@CrossOrigin(origins = {"http://localhost:4200","*"},allowedHeaders = "*")
@RestController
@RequestMapping("/marca")
public class MarcaController {

	@Autowired private MarcaRepository data;
	
	@GetMapping("")
	public ResponseEntity<List<Marca>> listar(){
		List<Marca> marca=data.findAll();
		return new ResponseEntity<List<Marca>>(marca,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Marca> buscar(@PathVariable Integer id){
		Marca cat=data.findById(id).orElse(null);
		return new ResponseEntity(cat,HttpStatus.OK);
	}
	
	@PostMapping("")
	public ResponseEntity<?> agregar(@RequestBody Marca marca){
		return new ResponseEntity(data.save(marca),HttpStatus.OK);
	}
	
}
