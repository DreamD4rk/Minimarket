package tienda.com.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class DetalleVentaKey implements Serializable {
    @Column(name = "producto_id")
    private Integer productoId;
    @Column(name = "venta_id")
    private Integer ventaId;
}
