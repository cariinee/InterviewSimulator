package com.example.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.dtos.EmpresaDTO;
import com.example.demo.model.Empresa;
import com.example.demo.services.EmpresaService;

import jakarta.validation.Valid;

public class EmpresaController {
    private EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService){
        this.empresaService = empresaService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Empresa salvar(@Valid @RequestBody EmpresaDTO empresaDTO) {
        Empresa e = empresaService.salvar(empresaDTO);
        return e;
    }


    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmpresa(@PathVariable Long id) {
        empresaService.remover(id);
    }

    @PutMapping("{id}")
    public void editEmpresa(@PathVariable Long id, @RequestBody EmpresaDTO dto) {
        empresaService.editar(id, dto);
    }

    @GetMapping("/{empresaId}/validar-acesso/{tecnologiaId}")
    public ResponseEntity<Boolean> validarAcesso(@PathVariable Long empresaId, @PathVariable Long tecnologiaId) {
    boolean temAcesso = empresaService.validarAcessoTecnologia(empresaId, tecnologiaId);
    return ResponseEntity.ok(temAcesso);
    }

}
