package tienda.com.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "producto")
@Data
public class Producto {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPro;
	
	@Column(length = 150)
    private String nombre;
	
	@Column(length = 50)
    private Double precio;
	
	@Column(length = 50)
    private Integer stock;
	
	@Column(length = 20)
    private Boolean estado;
	
	@ManyToOne
	@JoinColumn(name="id_cat", nullable=false)
	private Categoria categoria;
	
	@ManyToOne
	@JoinColumn(name="id_marca", nullable=false)
	private Marca marca;
	
}
