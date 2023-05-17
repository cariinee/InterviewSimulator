package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.dtos.TecnologiaDTO;
import com.example.demo.model.Tecnologia;

@Service
public interface TecnologiaService {
    
    Tecnologia salvar(TecnologiaDTO empresaDTO);

    void remover(Long id);

    void editar(Long id, TecnologiaDTO empresaDto);
}
