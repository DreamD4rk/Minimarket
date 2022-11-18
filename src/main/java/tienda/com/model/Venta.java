package tienda.com.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ventas")
@Data
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    private Integer total;

    @ManyToMany(mappedBy = "itemsVenta")
    private Set<Producto> itemsProducto = new HashSet<>();
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;
}
