package com.sofka.ejercicio2.repositorio;

import com.sofka.ejercicio2.modelo.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUsuario extends MongoRepository<Usuario, Long> {
}
