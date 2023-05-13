package com.example.demo.services;

import com.example.demo.dtos.CandidatoDTO;
import com.example.demo.model.Candidato;

public interface CandidatoService {
    Candidato salvar(CandidatoDTO candidatoDTO);

    void remover(Long id);

    void editar(Long id, CandidatoDTO candidatoDto);
    
}
