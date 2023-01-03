package com.sofka.ejercicio2.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;

}
