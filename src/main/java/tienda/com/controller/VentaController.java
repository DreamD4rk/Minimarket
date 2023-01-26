package tienda.com.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tienda.com.modelo.Ventas;
import tienda.com.repositorio.VentasRepository;
import tienda.com.services.VentaService;

@CrossOrigin(origins = {"http://localhost:4200","*"},allowedHeaders = "*")
@RestController
@RequestMapping("/ventas")
public class VentaController {

	@Autowired private VentaService data;
	@Autowired private VentasRepository data1;
	
	@PostMapping("/agregar")
	public ResponseEntity<Integer> agregar(@RequestBody Ventas venta){
		int res = data.guardar(venta);
		if(res==0) {
			return new ResponseEntity<Integer>(res,HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Integer>(res,HttpStatus.OK);
	}
	
	@PutMapping("")
	public ResponseEntity<Integer> actualizar(@RequestBody Ventas venta){
		int res = data.guardar(venta);
		if(res==0) {
			return new ResponseEntity<Integer>(res,HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Integer>(res,HttpStatus.OK);
	}
	
	@GetMapping
	public List<Ventas> listar(){
		return data1.findAll();
	}
	
	/*@GetMapping("/filtrar/{fecha}")
	public ResponseEntity<List<Ventas>> filtrarXfecha(@PathVariable String fecha){
		List<Ventas> lista = data.filtrarXventa(fecha);
		return ResponseEntity.ok(lista);
	}*/
}
