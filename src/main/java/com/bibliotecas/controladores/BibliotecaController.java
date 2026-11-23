package com.bibliotecas.controladores;

import com.bibliotecas.dto.BibliotecaDTO;
import com.bibliotecas.dto.BibliotecaRequest;
import com.bibliotecas.servicios.BibliotecaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bibliotecas")
@CrossOrigin(origins = "*")
public class BibliotecaController {

    private final BibliotecaService service;

    public BibliotecaController(BibliotecaService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BibliotecaDTO registrar(@Valid @RequestBody BibliotecaRequest request) {
        return service.registrar(request);
    }

    @GetMapping
    public List<BibliotecaDTO> consultar() {
        return service.consultar();
    }
}
