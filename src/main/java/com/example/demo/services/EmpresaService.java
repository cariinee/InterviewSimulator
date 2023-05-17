package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.dtos.EmpresaDTO;
import com.example.demo.model.Empresa;

@Service
public interface EmpresaService {

    Empresa salvar(EmpresaDTO empresaDTO);

    void remover(Long id);

    void editar(Long id, EmpresaDTO empresaDto);

    boolean validarAcessoTecnologia(Long empresaId, Long tecnologiaId);

    
}
