package com.bibliotecas.dto;

import java.util.List;

public record BibliotecaDTO(Long id, String nombre, String direccion, String ciudad, List<LibroDTO> libros) {
}
