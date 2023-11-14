package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.inventario;
import com.example.demo.service.inventarioService;

@RestController
@RequestMapping(path = "api/v1/inventario")
public class inventarioController {

    @Autowired
    private inventarioService inventarioService;

    @GetMapping
    public List<inventario> getAll() {
        return inventarioService.getInventario();
    }

    @PostMapping
    public void saveUpdate(@RequestBody inventario inventario) {
        inventarioService.saveOrUpdate(inventario);
    }

    @DeleteMapping("/{inventarioId}")
    public void delete(@PathVariable("inventarioId") Long inventarioId) {
        inventarioService.delete(inventarioId);
    }

    @GetMapping("/{inventarioId}")
    public Optional<inventario> getById(@PathVariable("inventarioId") Long inventarioId) {
        return inventarioService.getInventario(inventarioId);
    }
}
