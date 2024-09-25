package com.example.javafx.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity @Data
public class Libro  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer isbn;
    private String titulo;
    private Integer anio;
    private Integer ejemplares;
    private Integer ejemplaresPrestados;
    private Integer ejemplaresRestantes;
    private Boolean alta;
    private String autorNombre;
    private String editorialNombre;
}
