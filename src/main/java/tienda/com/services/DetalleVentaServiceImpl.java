package tienda.com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tienda.com.modelo.Detalle_Venta;
import tienda.com.repositorio.DetalleVentaRepository;

@Service
public class DetalleVentaServiceImpl implements DetalleVentaService {

	@Autowired private DetalleVentaRepository data;
	
	@Override
	public int guardar(Detalle_Venta detallev) {
		// TODO Auto-generated method stub
		int res = 0;
		Detalle_Venta dt = data.save(detallev);
		if(dt != null) {
			res = 1;
		}
		return res;
	}

	@Override
	public List<Detalle_Venta> listar() {
		// TODO Auto-generated method stub
		return data.findAll();
	}

	
	
}
