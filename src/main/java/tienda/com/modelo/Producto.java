package tienda.com.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "producto")
public class Producto {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_prod;
	
	@Column(length = 50)
    private String nom_prod;
	
	@Column(length = 50)
    private Double precio_prod;

	
	@OneToMany(mappedBy="producto")
    private List<Detalle_Venta> detalle_venta;
	
	@ManyToOne
	@JoinColumn(name="id_cat", nullable=false)
	private Categoria categoria;
	
	@ManyToOne
	@JoinColumn(name="id_marca", nullable=false)
	private Marca marca;
	
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Producto(Integer id_prod, String nom_prod, Double precio_prod) {
		super();
		this.id_prod = id_prod;
		this.nom_prod = nom_prod;
		this.precio_prod = precio_prod;
	}

	public Integer getId_prod() {
		return id_prod;
	}

	public void setId_prod(Integer id_prod) {
		this.id_prod = id_prod;
	}

	public String getNom_prod() {
		return nom_prod;
	}

	public void setNom_prod(String nom_prod) {
		this.nom_prod = nom_prod;
	}

	public Double getPrecio_prod() {
		return precio_prod;
	}

	public void setPrecio_prod(Double precio_prod) {
		this.precio_prod = precio_prod;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
