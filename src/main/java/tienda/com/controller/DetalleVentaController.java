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

import tienda.com.modelo.Detalle_Venta;
import tienda.com.repositorio.DetalleVentaRepository;
import tienda.com.services.DetalleVentaServiceImpl;

@CrossOrigin(origins = {"http://localhost:4200","*"},allowedHeaders = "*")
@RestController
@RequestMapping("/detalleventa")
public class DetalleVentaController {

	@Autowired private DetalleVentaServiceImpl data;
	
	@PostMapping("")
	public ResponseEntity<?> agregar(@RequestBody Detalle_Venta dt){
		int res = data.guardar(dt);
		if(res == 0) {
			return new ResponseEntity(res,HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(res,HttpStatus.OK);
	}
	
	@GetMapping("")
	public ResponseEntity<List<Detalle_Venta>> listar(){
		List<Detalle_Venta> lista=data.listar();
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/xventa/{id}")
	public ResponseEntity<List<Detalle_Venta>> listarXventa(@PathVariable Integer id){
		List<Detalle_Venta> lista = data.buscarXventa(id);
		return ResponseEntity.ok(lista);
	}
	
}
