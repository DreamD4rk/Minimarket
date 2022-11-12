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
@Table(name = "categoria")
public class Categoria {
	
	 private static final long serialVersionUID = 1L;
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_cat;

	@Column(length = 50)
	private String descripcion_cat;
	
	@OneToMany(mappedBy="categoria")
    private List<Producto> producto;
	
	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categoria(Integer id_cat, String descripcion_cat) {
		super();
		this.id_cat = id_cat;
		this.descripcion_cat = descripcion_cat;
	}

	public Integer getId_cat() {
		return id_cat;
	}

	public void setId_cat(Integer id_cat) {
		this.id_cat = id_cat;
	}

	public String getDescripcion_cat() {
		return descripcion_cat;
	}

	public void setDescripcion_cat(String descripcion_cat) {
		this.descripcion_cat = descripcion_cat;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
