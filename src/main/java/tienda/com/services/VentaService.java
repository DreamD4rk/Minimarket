package tienda.com.services;

import java.util.Date;
import java.util.List;

import tienda.com.modelo.Ventas;

public interface VentaService {

	public int guardar(Ventas venta);
	public List<Ventas> filtrarXventa(String fecha );
	
}
