package com.bibliotecas.entidades;

import jakarta.persistence.*;

@Entity
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String autor;
    @Column(name = "anio_publicacion")
    private Integer anioPublicacion;

    @ManyToOne(optional = false)
    @JoinColumn(name = "biblioteca_id", nullable = false)
    private Biblioteca biblioteca;

    public Libro() {}

    public Libro(String titulo, String autor, Integer anioPublicacion, Biblioteca biblioteca) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.biblioteca = biblioteca;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
    public Integer getAnioPublicacion() { return anioPublicacion; }
    public void setAnioPublicacion(Integer anioPublicacion) { this.anioPublicacion = anioPublicacion; }
    public Biblioteca getBiblioteca() { return biblioteca; }
    public void setBiblioteca(Biblioteca biblioteca) { this.biblioteca = biblioteca; }
}
