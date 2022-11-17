package tienda.com.modelo;

import lombok.Data;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "usuario")
@Data
public class Usuario {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	 	
	 	@Column(length = 50)
	    private String nombre;
	 	
	 	@Column(length = 50)
	    private String email;
	 	
	 	@Column(unique = true, nullable = false) //unique para que el password no se repita
	    private Integer password;

	 	// ONE-TO-ONE ASSOCIATIONS
	    // LLAVE FORANEA Y RELACION CON LA TABLA ROLES
	    @OneToOne
	    @JoinColumn(name = "id_rol", referencedColumnName = "id")
	    private Rol rol;
	 	
	    //RELACION CON VENTAS
	    @OneToMany(mappedBy="usuario")
	    private List<Ventas> ventas;

}
