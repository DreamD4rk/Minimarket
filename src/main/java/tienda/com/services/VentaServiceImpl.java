package tienda.com.services;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import tienda.com.modelo.Ventas;
import tienda.com.repositorio.VentasRepository;

@Service
public class VentaServiceImpl implements VentaService {

	@Autowired private VentasRepository data;
	
	@Override
	public int guardar(Ventas venta) {
		// TODO Auto-generated method stub
		int res = 0;
		Ventas v=data.save(venta);
		if(v!=null) {
			res=1;
		}
		return res;
	}

	@Override
	public List<Ventas> filtrarXventa(String fecha) {
		// TODO Auto-generated method stub
		return data.findByFecha(fecha);
	}

}
