package tienda.com.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "detalles_ventas")
@Data
public class DetalleVenta {
    @Id
    @OneToOne
    @JoinColumn(name = "venta_id", referencedColumnName = "id", nullable = false)
    private Venta venta;
    @Id
    @ManyToOne
    @JoinColumn(name = "producto_id", referencedColumnName = "id", nullable = false)
    private Producto producto;
    private Integer cantidad;
    private Double subtotal;
}

