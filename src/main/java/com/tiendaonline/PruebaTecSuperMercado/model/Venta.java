package com.tiendaonline.PruebaTecSuperMercado.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fecha;
    private String estado;
    private Double total;


    // Establecemos la relación en hay entre la Venta y la Sucursal
    @ManyToOne      //  Indica que muchas Ventas estan asociadas a una Sucursal
    private Sucursal sucursal;


}
