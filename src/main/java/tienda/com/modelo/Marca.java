package tienda.com.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "marca")
public class Marca {
	
	 private static final long serialVersionUID = 1L;
	 
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id_marca;
	 
	 @Column(length = 50)
	 private String nom_marca;

	 @OneToMany(mappedBy="marca")
	    private List<Producto> producto;
	 
	 
	 
	public Marca() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Marca(Integer id_marca, String nom_marca) {
		super();
		this.id_marca = id_marca;
		this.nom_marca = nom_marca;
	}

	public Integer getId_marca() {
		return id_marca;
	}

	public void setId_marca(Integer id_marca) {
		this.id_marca = id_marca;
	}

	public String getNom_marca() {
		return nom_marca;
	}

	public void setNom_marca(String nom_marca) {
		this.nom_marca = nom_marca;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
