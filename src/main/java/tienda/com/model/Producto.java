package tienda.com.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "productos")
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 30)
    private String nombre;
    private Double precio;
    private Integer stock;
    private Boolean estado;


    @OneToMany(mappedBy = "producto")
    private List<DetalleVenta> itemsDetalleVenta;

    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "marca_id", nullable = false)
    private Marca marca;
}

