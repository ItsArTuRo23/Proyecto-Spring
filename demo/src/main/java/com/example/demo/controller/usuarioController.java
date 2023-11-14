package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.usuario;
import com.example.demo.service.usuarioService;

@RestController
@RequestMapping(path = "api/v1/usuarios")
public class usuarioController {

    @Autowired
    private usuarioService usuarioService;


    @GetMapping
    public java.util.List<usuario> getAll(){
        return usuarioService.getUsuarios();
    }

    @PostMapping
    public void saveUpdate(@RequestBody usuario usuario){
        usuarioService.saveOrUpdate(usuario);
    }

    @DeleteMapping("/{usuarioId}")
    public void saveUpdate(@PathVariable("usuarioId") Long usuarioIdL){
        usuarioService.delete(usuarioIdL);
    }

     @GetMapping("/{usuarioId}")
    public Optional<usuario> getBId(@PathVariable("usuarioId") Long usuarioId){
        return usuarioService.getUsuarios( usuarioId);
    }
    
}
