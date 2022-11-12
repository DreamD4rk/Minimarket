package tienda.com.modelo;

import java.util.Date;

import javax.persistence.Column;
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

@Entity
@Table(name = "ventas")
public class Ventas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_venta;
	
	@Temporal(TemporalType.DATE)
    private Date f_venta;
	
	@Column(length = 50)
    private Integer total_venta;

	@OneToOne(mappedBy = "ventas")
    private Detalle_Venta detalle_venta;
	
	
	@ManyToOne
	@JoinColumn(name="id_usu", nullable=false)
	private Usuario usuario;
	
	
	public Ventas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ventas(Integer id_venta, Date f_venta, Integer total_venta) {
		super();
		this.id_venta = id_venta;
		this.f_venta = f_venta;
		this.total_venta = total_venta;
	}

	public Integer getId_venta() {
		return id_venta;
	}

	public void setId_venta(Integer id_venta) {
		this.id_venta = id_venta;
	}

	public Date getF_venta() {
		return f_venta;
	}

	public void setF_venta(Date f_venta) {
		this.f_venta = f_venta;
	}

	public Integer getTotal_venta() {
		return total_venta;
	}

	public void setTotal_venta(Integer total_venta) {
		this.total_venta = total_venta;
	}
}
