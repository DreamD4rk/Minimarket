package tienda.com.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "detalle_venta")
public class Detalle_Venta{
	
	private static final long serialVersionUID = 1L;
	
	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_detalle;*/
	@Id
	@Column
	private Integer cantidad;
	
	@Column
	private Double subtotal;
	
	@OneToOne
    @JoinColumn(name = "id_venta", referencedColumnName = "id_venta",nullable=false)
    private Ventas ventas;
	
	@ManyToOne
	@JoinColumn(name="id_prod", referencedColumnName = "id_prod")
	private Producto producto;
	
	public Detalle_Venta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Detalle_Venta(Integer cantidad, Double subtotal) {
		super();
		this.cantidad = cantidad;
		this.subtotal = subtotal;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
