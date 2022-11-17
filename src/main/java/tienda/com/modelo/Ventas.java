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

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Table(name = "ventas")
@Data
public class Ventas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Integer ventaId;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha;

	@Column(length = 50)
	private Integer total;

	// MAPEO DE LA TABLA VENTA A DETALLE_VENTA
	@OneToOne(mappedBy = "ventas")
	private Detalle_Venta detalle_venta;

	// UNIENDO COLUMNA ID_USUARIO A TABLA VENTAS
	@ManyToOne
	@JoinColumn(name = "usu_id", nullable = false)
	private Usuario usuario;
}
