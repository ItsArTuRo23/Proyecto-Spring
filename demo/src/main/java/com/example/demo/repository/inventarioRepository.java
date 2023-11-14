package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.inventario;

@Repository
public interface inventarioRepository extends JpaRepository<inventario, Long> {
    // Puedes agregar consultas personalizadas si es necesario
    // Spring Data JPA proporciona métodos de consulta automáticamente
}