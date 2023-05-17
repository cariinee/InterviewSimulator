package com.example.demo.controllers;

import java.util.Collections;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Candidato;
import com.example.demo.model.Tecnologia;
import com.example.demo.repositories.CandidatoRepository;
import com.example.demo.repositories.TecnologiaRepository;


@RestController
@RequestMapping()
public class CandidatoController {
    @Autowired
    private CandidatoRepository candidatoRepository;

    @Autowired
    private TecnologiaRepository tecnologiaRepository;
    
    @PostMapping()
    public Candidato cadastrarCandidato(@RequestBody Candidato candidato) {
        return candidatoRepository.save(candidato);
    }
    
    // @GetMapping("/buscar-candidatos/{tecnologiaId}")
    // public List<Candidato> buscarCandidatosBemNaTecnologia(@PathVariable Long tecnologiaId) {
    //     Tecnologia tecnologia = tecnologiaRepository.findById(tecnologiaId).orElse(null);
        
    //     if (tecnologia != null) {
    //         List<Candidato> candidatos = candidatoRepository.findByPontuacao(tecnologia, 6);
    //         return candidatos;
    //     }
        
    //     return Collections.emptyList();
    // }
}