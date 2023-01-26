package tienda.com.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "detalle_ventas")
@Data
public class Detalle_Venta{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDetalleVenta;
	
	@Column
	private Integer cantidad;
	
	@ManyToOne
	@JoinColumn(name="id_pro")
	private Producto idPro;
	
	@ManyToOne
	@JoinColumn(name = "venta_id",insertable = true,updatable = true)
	private Ventas ventaId;
	
	public Detalle_Venta() {
		// TODO Auto-generated constructor stub
	}

	

	public Detalle_Venta(Integer idDetalleVenta, Integer cantidad, Producto idPro, Ventas ventaId) {
		super();
		this.idDetalleVenta = idDetalleVenta;
		this.cantidad = cantidad;
		this.idPro = idPro;
		this.ventaId = ventaId;
	}



	public Integer getIdDetalleVenta() {
		return idDetalleVenta;
	}

	public void setIdDetalleVenta(Integer idDetalleVenta) {
		this.idDetalleVenta = idDetalleVenta;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getIdPro() {
		return idPro;
	}

	public void setIdPro(Producto idPro) {
		this.idPro = idPro;
	}



	public Ventas getVentaId() {
		return ventaId;
	}



	public void setVentaId(Ventas ventaId) {
		this.ventaId = ventaId;
	}

	
	
}
