package tienda.com.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "marcas")
@Data
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 30, nullable = false)
    private String nombre;
    @OneToMany(mappedBy="marca")
    private List<Producto> itemsProducto;
}
