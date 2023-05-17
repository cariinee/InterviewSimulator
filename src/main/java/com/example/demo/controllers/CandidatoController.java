package com.example.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.CandidatoDTO;
import com.example.demo.model.Candidato;
import com.example.demo.services.CandidatoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/candidato")
public class CandidatoController {
    private CandidatoService candidatoService;

    public CandidatoController(CandidatoService candidatoService){
        this.candidatoService = candidatoService;
    }

    @PostMapping("/api/candidato")
    @ResponseStatus(HttpStatus.CREATED)
    public Candidato salvar(@Valid @RequestBody CandidatoDTO candidatoDTO) {
        Candidato c = candidatoService.salvar(candidatoDTO);
        return c;
    }


    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCurso(@PathVariable Long id) {
        candidatoService.remover(id);
    }

    @PutMapping("{id}")
    public void editCurso(@PathVariable Long id, @RequestBody CandidatoDTO dto) {
        candidatoService.editar(id, dto);
    }

}
