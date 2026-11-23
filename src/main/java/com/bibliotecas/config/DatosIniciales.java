package com.bibliotecas.config;

import com.bibliotecas.entidades.Biblioteca;
import com.bibliotecas.entidades.Libro;
import com.bibliotecas.repositorios.BibliotecaRepository;
import com.bibliotecas.repositorios.LibroRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatosIniciales implements CommandLineRunner {

    private final BibliotecaRepository bibliotecaRepository;
    private final LibroRepository libroRepository;

    public DatosIniciales(BibliotecaRepository bibliotecaRepository, LibroRepository libroRepository) {
        this.bibliotecaRepository = bibliotecaRepository;
        this.libroRepository = libroRepository;
    }

    @Override
    public void run(String... args) {
        if (bibliotecaRepository.count() > 0) {
            return;
        }
        Biblioteca central = bibliotecaRepository.save(new Biblioteca("Biblioteca Central", "Calle 10 # 5-20", "Bogotá"));
        Biblioteca norte = bibliotecaRepository.save(new Biblioteca("Biblioteca Norte", "Carrera 15 # 100-30", "Bogotá"));

        libroRepository.save(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, central));
        libroRepository.save(new Libro("El coronel no tiene quien le escriba", "Gabriel García Márquez", 1961, norte));
    }
}
