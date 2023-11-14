package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.inventario;
import com.example.demo.repository.inventarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class inventarioService {

    @Autowired
    private inventarioRepository inventarioRepository;

    public List<inventario> getInventario() {
        return inventarioRepository.findAll();
    }

    public Optional<inventario> getInventario(Long id) {
        return inventarioRepository.findById(id);
    }

    public void saveOrUpdate(inventario inventario) {
        inventarioRepository.save(inventario);
    }

    public void delete(Long id) {
        inventarioRepository.deleteById(id);
    }

    
}
