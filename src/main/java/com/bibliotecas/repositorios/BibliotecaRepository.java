package com.bibliotecas.repositorios;

import com.bibliotecas.entidades.Biblioteca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BibliotecaRepository extends JpaRepository<Biblioteca, Long> {
}
