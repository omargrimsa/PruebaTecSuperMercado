package com.tiendaonline.PruebaTecSuperMercado.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter     // lombok agrega los getters y setters
@NoArgsConstructor  // lombok agrega el constructor sin argumentos
@AllArgsConstructor // lombok agrega el constructor con todos los argumentos
public class SucursalDTO {
    private Long id;
    private String nombre;
    private String direccion;
}
