package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.dtos.CandidatoDTO;
import com.example.demo.model.Candidato;

@Service
public interface CandidatoService {
    Candidato salvar(CandidatoDTO candidatoDTO);

    void remover(Long id);

    void editar(Long id, CandidatoDTO candidatoDto);
    
}
