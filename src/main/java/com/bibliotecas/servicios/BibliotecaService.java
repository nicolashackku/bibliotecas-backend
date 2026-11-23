package com.bibliotecas.servicios;

import com.bibliotecas.dto.BibliotecaDTO;
import com.bibliotecas.dto.BibliotecaRequest;
import com.bibliotecas.dto.LibroDTO;
import com.bibliotecas.entidades.Biblioteca;
import com.bibliotecas.repositorios.BibliotecaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BibliotecaService {

    private final BibliotecaRepository repository;

    public BibliotecaService(BibliotecaRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public BibliotecaDTO registrar(BibliotecaRequest request) {
        Biblioteca guardada = repository.save(
                new Biblioteca(request.nombre(), request.direccion(), request.ciudad()));
        return aDTO(guardada);
    }

    @Transactional(readOnly = true)
    public List<BibliotecaDTO> consultar() {
        return repository.findAll().stream().map(this::aDTO).toList();
    }

    private BibliotecaDTO aDTO(Biblioteca b) {
        List<LibroDTO> libros = b.getLibros().stream()
                .map(l -> new LibroDTO(l.getId(), l.getTitulo(), l.getAutor(), l.getAnioPublicacion()))
                .toList();
        return new BibliotecaDTO(b.getId(), b.getNombre(), b.getDireccion(), b.getCiudad(), libros);
    }
}
