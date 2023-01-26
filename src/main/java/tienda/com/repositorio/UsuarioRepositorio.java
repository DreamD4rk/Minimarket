package tienda.com.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tienda.com.modelo.Clientes;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Clientes, Integer> {

	Clientes findByUsernameAndPassword(String username,String password);
	
}
