package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.model.Empresa;
import com.example.demo.repositories.EmpresaRepository;

@Service
public class EmpresaService {
    private final EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public Empresa cadastrarEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    
}
