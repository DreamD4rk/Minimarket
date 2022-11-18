package tienda.com.model;

import lombok.Data;

import javax.persistence.*;

@Data
public class DetalleVenta {
    private Venta venta;
    private Producto producto;
    private Integer cantidad;
    private Double subtotal;
}

