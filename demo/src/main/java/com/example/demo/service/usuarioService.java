package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.usuario;
import com.example.demo.repository.usuarioRepository;

@Service

public class usuarioService {

    @Autowired
   static
     usuarioRepository usuarioRepository;

     public java.util.List<usuario> getUsuarios(){
        return usuarioRepository.findAll();


     }

     public java.util.Optional<usuario>  getUsuarios(Long id){
        return usuarioRepository.findById(id);
     }

     public void saveOrUpdate (usuario Usuario){
        usuarioRepository.save(Usuario);
     }

      public void delete (Long id){
        usuarioRepository.deleteById(id);
     }



     

    
}
