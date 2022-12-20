package tienda.com.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tienda.com.modelo.Detalle_Venta;

@Repository
public interface DetalleVentaRepository extends JpaRepository<Detalle_Venta, Integer> {

}
