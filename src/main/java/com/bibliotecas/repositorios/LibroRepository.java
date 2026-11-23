package com.bibliotecas.repositorios;

import com.bibliotecas.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}
