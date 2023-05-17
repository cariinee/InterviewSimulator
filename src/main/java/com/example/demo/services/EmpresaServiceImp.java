package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dtos.EmpresaDTO;
import com.example.demo.model.Empresa;
import com.example.demo.model.Tecnologia;
import com.example.demo.repositories.EmpresaRepository;
import com.example.demo.repositories.TecnologiaRepository;

@Service
public class EmpresaServiceImp implements EmpresaService{
    
    @Autowired
    private EmpresaRepository empresaRepository;

    @Autowired
    private TecnologiaRepository tecnologiaRepository;

    @Override
    public boolean validarAcessoTecnologia(Long empresaId, Long tecnologiaId) {
        Optional<Empresa> empresaOptional = empresaRepository.findById(empresaId);

        if (empresaOptional.isPresent()) {
            Empresa empresa = empresaOptional.get();

            // Use o TecnologiaRepository ou outro método para obter a instância da tecnologia com base no ID.
            // Aqui, estou assumindo que você possui um método chamado "getTecnologiaById" no TecnologiaRepository.
            Optional<Tecnologia> tecnologiaOptional = tecnologiaRepository.findById(tecnologiaId);

            if (tecnologiaOptional.isPresent()) {
                Tecnologia tecnologia = tecnologiaOptional.get();

                // Verifique se a empresa tem acesso à tecnologia.
                return empresa.temAcessoTecnologia(tecnologia);
            }
        }

        return false;
    }

    @Override
    public Empresa salvar(EmpresaDTO empresaDTO) {
        throw new UnsupportedOperationException("Unimplemented method 'salvar'");
    }

    @Override
    public void remover(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }

    @Override
    public void editar(Long id, EmpresaDTO empresaDto) {
        throw new UnsupportedOperationException("Unimplemented method 'editar'");
    }
}
