package tienda.com.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Table(name = "venta")
@Embeddable
public class Ventas {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ventaId;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha;

	@Column(length = 50)
	private Integer total;


	// UNIENDO COLUMNA ID_USUARIO A TABLA VENTAS
	@ManyToOne
	@JoinColumn(name = "usu_id", nullable = false)
	private Usuario usuario;
	
	public Ventas() {
		// TODO Auto-generated constructor stub
	}

	public Ventas(Integer ventaId, Date fecha, Integer total, Usuario usuario) {
		super();
		this.ventaId = ventaId;
		this.fecha = fecha;
		this.total = total;
		this.usuario = usuario;
	}

	public Integer getVentaId() {
		return ventaId;
	}

	public void setVentaId(Integer ventaId) {
		this.ventaId = ventaId;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
