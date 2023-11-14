package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_usuario")

public class usuario {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long usuarioId;

    private String nombre;

    private String aPaterno;

    private String aMaterno;

    @Column(name = "email_address", unique = true , nullable = false)
    private String correo;


    
}
