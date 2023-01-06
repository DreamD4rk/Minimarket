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
public class Usuario {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	 	
	 	@Column(length = 50)
	    private String nombre;
	 	
	 	@Column(unique = true,nullable = false)
	 	private String username;
	 	
	 	@Column(length = 50)
	    private String email;
	 	
	 	@Column(nullable = false) 
	    private String password;

	 	// ONE-TO-ONE ASSOCIATIONS
	    // LLAVE FORANEA Y RELACION CON LA TABLA ROLES
	    @OneToOne
	    @JoinColumn(name = "id_rol", referencedColumnName = "id")
	    private Rol idRol;
	 	
	    //RELACION CON VENTAS
	    @OneToMany(mappedBy="usuId")
	    private List<Ventas> ventas;
	    
	    public Usuario() {
			// TODO Auto-generated constructor stub
		}

		public Usuario(Integer id, String nombre, String username, String email, String password, Rol idRol,
				List<Ventas> ventas) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.username = username;
			this.email = email;
			this.password = password;
			this.idRol = idRol;
			this.ventas = ventas;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Rol getIdRol() {
			return idRol;
		}

		public void setIdRol(Rol idRol) {
			this.idRol = idRol;
		}

		public List<Ventas> getVentas() {
			return ventas;
		}

		public void setVentas(List<Ventas> ventas) {
			this.ventas = ventas;
		}
	    
	    

}
