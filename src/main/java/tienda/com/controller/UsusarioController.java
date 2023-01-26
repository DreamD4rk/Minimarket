package tienda.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
import tienda.com.modelo.Clientes;
import tienda.com.services.UsuarioServiceImpl;

@CrossOrigin(origins = {"http://localhost:4200","*"},allowedHeaders = "*")
@RestController
@RequestMapping("/usuario")
public class UsusarioController {
	
	@Autowired private UsuarioServiceImpl data;
	
	@GetMapping("/sesion/{username}/{password}")
	public ResponseEntity<Clientes> iniciarSesion(@PathVariable String username,@PathVariable String password){
		Clientes usu=data.iniciarSesion(username, password);
		return new ResponseEntity<Clientes>(usu,HttpStatus.OK);
	}
	
	@GetMapping("/list")
	public Page<Clientes> listar(@RequestParam(defaultValue = "0") int page){
		return data.pageAll(new QPageRequest(page, 4));
	}
	
	@GetMapping("")
	public ResponseEntity<List<Clientes>> listar(){
		List<Clientes> lista = data.findAll();
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping("")
	public ResponseEntity<Integer> agregar(@RequestBody Clientes usuario){
		int res = data.guardar(usuario);
		if(res == 0 ) {
			return new ResponseEntity<Integer>(res,HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Integer>(res,HttpStatus.OK);
	}
	
	@PutMapping("")
	public ResponseEntity<Integer> actualizar(@RequestBody Clientes usuario){
		int res = data.guardar(usuario);
		if(res == 0 ) {
			return new ResponseEntity<Integer>(res,HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Integer>(res,HttpStatus.OK);
	}
	
}
