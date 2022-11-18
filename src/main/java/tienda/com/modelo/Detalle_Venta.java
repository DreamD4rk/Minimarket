package tienda.com.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "detalle_venta")
@Data

public class Detalle_Venta implements Serializable{
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;
	
	@Column
	private Integer cantidad;
	
	@Column
	private Double subtotal;
	
	//Chales we, ahora el ventasId tambien sea la clave primaria aqui
	//Ya que borraron el @id  >:v
	@EmbeddedId
	@OneToOne
    @JoinColumn(name = "ventaId", referencedColumnName = "ventaId",nullable=false)
    private Ventas ventas;
	
	@ManyToOne
	@JoinColumn(name="idPro", referencedColumnName = "idPro")
	private Producto producto;
	
}
