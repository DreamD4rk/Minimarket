package tienda.com.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "roles")
public class Roles {
 
	private static final long serialVersionUID = 1L;
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_rol;

    @Column(length = 50)
    private String nombre_rol;

    // ONE-TO-ONE ASSOCIATIONS
    // REALACION CON LA TABLA USUARIO
     @OneToOne(mappedBy = "roles")
     	private Usuario Usuario;
    
	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Roles(Integer id_rol, String nombre_rol) {
		super();
		this.id_rol = id_rol;
		this.nombre_rol = nombre_rol;
	}

	public Integer getId_rol() {
		return id_rol;
	}

	public void setId_rol(Integer id_rol) {
		this.id_rol = id_rol;
	}

	public String getNombre_rol() {
		return nombre_rol;
	}

	public void setNombre_rol(String nombre_rol) {
		this.nombre_rol = nombre_rol;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
