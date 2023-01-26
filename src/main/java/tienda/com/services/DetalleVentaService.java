package tienda.com.services;

import java.util.List;

import tienda.com.modelo.Detalle_Venta;

public interface DetalleVentaService {

	public int guardar(Detalle_Venta detallev);
	public List<Detalle_Venta> listar();
	public List<Detalle_Venta> buscarXventa(Integer id);
	
}
