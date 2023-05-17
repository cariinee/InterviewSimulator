package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.dtos.EntrevistaDTO;
import com.example.demo.model.Entrevista;

@Service
public interface EntrevistaService {
    
    Entrevista salvar(EntrevistaDTO empresaDTO);

    void remover(Long id);

    void editar(Long id, EntrevistaDTO empresaDto);
}
