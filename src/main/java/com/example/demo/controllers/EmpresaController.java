package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Empresa;
import com.example.demo.model.Tecnologia;
import com.example.demo.repositories.EmpresaRepository;
import com.example.demo.repositories.TecnologiaRepository;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {
    @Autowired
    private EmpresaRepository empresaRepository;

    @Autowired
    private TecnologiaRepository tecnologiaRepository;
    
    @PostMapping
    public Empresa cadastrarEmpresa(@RequestBody Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    @GetMapping("/{empresaId}/validar-tecnologia/{tecnologiaId}")
    public boolean validarAcessoTecnologia(@PathVariable Long empresaId, @PathVariable Long tecnologiaId) {
        Empresa empresa = empresaRepository.findById(empresaId).orElse(null);
        Tecnologia tecnologia = tecnologiaRepository.findById(tecnologiaId).orElse(null);
        
        if (empresa != null && tecnologia != null) {
            // Verificar se a empresa tem acesso à tecnologia
            List<Tecnologia> tecnologiasAcesso = empresa.getTecnologiasAcesso(); // Obtém a lista de tecnologias de acesso da empresa
            for (Tecnologia t : tecnologiasAcesso) {
                if (t.getId().equals(tecnologiaId)) {
                    return true; // A empresa tem acesso à tecnologia
                }
            }
        }
        
        return false; // A empresa não tem acesso à tecnologia
}
    
    // outros métodos
}