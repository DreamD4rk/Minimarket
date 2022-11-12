package tienda.com.modelo;

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
	private static final long serialVersionUID = 1L;
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id_usu;
	 	
	 	@Column(length = 50)
	    private String nom_usu;
	 	
	 	@Column(length = 50)
	    private String correo_usu;

	 	// ONE-TO-ONE ASSOCIATIONS
	    // LLAVE FORANEA Y RELACION CON LA TABLA ROLES
	    @OneToOne
	    @JoinColumn(name = "id_rol", referencedColumnName = "id_rol")
	    private Roles roles;
	 	
	    //RELACION CON VENTAS
	    @OneToMany(mappedBy="usuario")
	    private List<Ventas> ventas; 
	    
	    
		public Usuario() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Usuario(Integer id_usu, String nom_usu, String correo_usu) {
			super();
			this.id_usu = id_usu;
			this.nom_usu = nom_usu;
			this.correo_usu = correo_usu;
		}

		public Integer getId_usu() {
			return id_usu;
		}

		public void setId_usu(Integer id_usu) {
			this.id_usu = id_usu;
		}

		public String getNom_usu() {
			return nom_usu;
		}

		public void setNom_usu(String nom_usu) {
			this.nom_usu = nom_usu;
		}

		public String getCorreo_usu() {
			return correo_usu;
		}

		public void setCorreo_usu(String correo_usu) {
			this.correo_usu = correo_usu;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
}
