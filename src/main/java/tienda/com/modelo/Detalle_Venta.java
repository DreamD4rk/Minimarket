package tienda.com.modelo;

import javax.persistence.Column;
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
public class Detalle_Venta{
	
	private static final long serialVersionUID = 1L;
	
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
	
}
