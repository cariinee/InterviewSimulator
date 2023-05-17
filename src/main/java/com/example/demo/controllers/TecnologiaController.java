package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Tecnologia;
import com.example.demo.repositories.TecnologiaRepository;

@RestController
@RequestMapping("/tecnologias")
public class TecnologiaController {
    @Autowired
    private TecnologiaRepository tecnologiaRepository;
    
    @PostMapping
    public Tecnologia cadastrarTecnologia(@RequestBody Tecnologia tecnologia) {
        return tecnologiaRepository.save(tecnologia);
    }
    
    // outros métodos
}
