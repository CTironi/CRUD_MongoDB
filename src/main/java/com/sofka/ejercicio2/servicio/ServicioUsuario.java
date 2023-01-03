package com.sofka.ejercicio2.servicio;

import com.sofka.ejercicio2.modelo.Usuario;

public interface ServicioUsuario {

    Usuario guardarUsuario(Usuario usuario);

    Usuario obtenerUsuario(Long idUsuario);

    Usuario usuarioAModificar(Long id, Usuario usuarioModificar);

    boolean eliminarUsuario(Long id);
}
