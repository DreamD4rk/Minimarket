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


	// UNIENDO COLUMNA ID_USUARIO A TABLA VENTAS
	@ManyToOne
	@JoinColumn(name = "usu_id")
	private Usuario usuId;
	
	
	public Ventas() {
		// TODO Auto-generated constructor stub
	}

	

	public Ventas(Integer ventaId, Date fecha, Usuario usuId) {
		super();
		this.ventaId = ventaId;
		this.fecha = fecha;
		this.usuId = usuId;
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

	public Usuario getUsuId() {
		return usuId;
	}

	public void setUsuId(Usuario usuId) {
		this.usuId = usuId;
	}
	
	
}
