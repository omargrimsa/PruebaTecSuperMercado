package com.tiendaonline.PruebaTecSuperMercado.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Getter @Setter     // lombok agrega los getters y setters
@NoArgsConstructor  // lombok agrega el constructor sin argumentos
@AllArgsConstructor // lombok agrega el constructor con todos los argumentos
public class Sucursal {
    @Id             // Indica que es la clave primaria de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que el id es autoincremental
    private Long id;
    private String nombre;
    private String direccion;
}
