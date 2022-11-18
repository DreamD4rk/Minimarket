package tienda.com.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "detalles_ventas")
public class DetalleVenta {
    @EmbeddedId
    private DetalleVentaKey id;

    @ManyToOne
    @MapsId("productoId")
    @JoinColumn(name = "producto_id")
    private Producto producto;

    @ManyToOne
    @MapsId("ventaId")
    @JoinColumn(name = "venta_id")
    private Venta venta;
    private Integer cantidad;
    private Double subtotal;
}

