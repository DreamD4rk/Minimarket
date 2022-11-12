package tienda.com.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "detalle_venta")
public class Detalle_Venta {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_detalle;
	
	@Column
	private Integer cantidad;
	
	@Column
	private Double precio;

	@OneToOne
    @JoinColumn(name = "id_venta", referencedColumnName = "id_venta")
    private Ventas ventas;
	
	@ManyToOne
	@JoinColumn(name="id_prod", nullable=false)
	private Producto producto;
	
	public Detalle_Venta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Detalle_Venta(Integer cantidad, Double precio) {
		super();
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
