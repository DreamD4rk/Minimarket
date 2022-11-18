package tienda.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tienda.com.model.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Integer> {

}
