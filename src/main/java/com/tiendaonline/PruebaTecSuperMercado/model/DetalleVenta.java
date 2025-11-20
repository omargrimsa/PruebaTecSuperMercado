package com.tiendaonline.PruebaTecSuperMercado.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne                  // Indica que muchas DetalleVentas estan asociadas a una Venta
    private Venta venta;        // Establecemos la relación en hay entre la DetalleVenta y la Venta

    @ManyToOne                  // Indica que muchas DetalleVentas estan asociadas a un Producto
    private Producto prod;      // Establecemos la relación en hay entre la DetalleVenta y el Producto

    private Integer cantProd;
    private Double preicio;


}
