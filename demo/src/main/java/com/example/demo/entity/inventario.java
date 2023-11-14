package com.example.demo.entity;

import lombok.Data;
import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

@Data
@Entity
public class inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Column(columnDefinition = "Ingrediente")
    private String descripcion;
    
    @Nonnull
    @DateTimeFormat(pattern = "yyyy.MM-dd")
    private LocalDate fechaAdquisicion;

    @Nonnull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaCaducidad;

    private int stock;

    @Column(columnDefinition = "comentariosAdicionales")
    private String comentariosAdicionales;

    @Column(name = "proveedores_nombre", columnDefinition = "Proveedor")
    private String nombreProveedor;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_medida", columnDefinition = "medidaTipo")
    private String tipoDeMedida;
}
