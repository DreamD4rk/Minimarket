package tienda.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tienda.com.modelo.Rol;
import tienda.com.repositorio.RolRepository;

@CrossOrigin(origins = {"http://localhost:4200","*"},allowedHeaders = "*")
@RestController
@RequestMapping("/roles")
public class RolesController {

	@Autowired private RolRepository data;
	
	@GetMapping("")
	public ResponseEntity<List<Rol>> listar(){
		List<Rol> role=data.findAll();
		return ResponseEntity.ok(role);
	}
	
}
