package tienda.com.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tienda.com.modelo.Ventas;

@Repository
public interface VentasRepository extends JpaRepository<Ventas, Integer> {

}
