package tienda.com.services;

import org.springframework.beans.factory.annotation.Autowired;
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

}
