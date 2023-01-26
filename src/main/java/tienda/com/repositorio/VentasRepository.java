package tienda.com.repositorio;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tienda.com.modelo.Ventas;

@Repository
public interface VentasRepository extends JpaRepository<Ventas, Integer> {

	List<Ventas> findByFecha(String fecha);
	
	
}
