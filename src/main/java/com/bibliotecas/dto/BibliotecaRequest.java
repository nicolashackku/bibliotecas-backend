package com.bibliotecas.dto;

import jakarta.validation.constraints.NotBlank;

public record BibliotecaRequest(
        @NotBlank String nombre,
        @NotBlank String direccion,
        @NotBlank String ciudad) {
}
