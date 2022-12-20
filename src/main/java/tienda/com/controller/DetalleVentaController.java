package tienda.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tienda.com.modelo.Detalle_Venta;
import tienda.com.repositorio.DetalleVentaRepository;

@CrossOrigin(origins = {"http://localhost:4200","*"},allowedHeaders = "*")
@RestController
@RequestMapping("/detalleventa")
public class DetalleVentaController {

	@Autowired private DetalleVentaRepository data;
	
	@PostMapping("")
	public ResponseEntity<?> agregar(@RequestBody Detalle_Venta dt){
		return new ResponseEntity(data.save(dt),HttpStatus.OK);
	}
	
}
