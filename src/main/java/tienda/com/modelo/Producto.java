package tienda.com.modelo;


import javax.persistence.CascadeType;
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
public class Producto {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPro;
	
	@Column(length = 150)
    private String nombre;
	
	@Column(length = 50)
    private Double precio;
	
	@Column(length = 50)
    private Integer stock;
	
    private String estado;
	
	private String imagen;
	
	@ManyToOne()
	@JoinColumn(name="id_cat")
	private Categoria idCat;
	
	@ManyToOne()
	@JoinColumn(name="id_marca")
	private Marca idMarca;

	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(Integer idPro, String nombre, Double precio, Integer stock, String estado, String imagen,
			Categoria idCat, Marca idMarca) {
		super();
		this.idPro = idPro;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.estado = estado;
		this.imagen = imagen;
		this.idCat = idCat;
		this.idMarca = idMarca;
	}

	public Integer getIdPro() {
		return idPro;
	}

	public void setIdPro(Integer idPro) {
		this.idPro = idPro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Categoria getIdCat() {
		return idCat;
	}

	public void setIdCat(Categoria idCat) {
		this.idCat = idCat;
	}

	public Marca getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(Marca idMarca) {
		this.idMarca = idMarca;
	}

	

}
