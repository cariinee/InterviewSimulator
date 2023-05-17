package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Entrevista;
import com.example.demo.repositories.EntrevistaRepository;

@RestController
@RequestMapping("/entrevistas")
public class EntrevistaController {
    @Autowired
    private EntrevistaRepository entrevistaRepository;
    
    @PostMapping
    public Entrevista registrarEntrevista(@RequestBody Entrevista entrevista) {
        return entrevistaRepository.save(entrevista);
    }
    
    // outros métodos
}
