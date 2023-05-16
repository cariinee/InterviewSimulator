package com.example.demo.repositories;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.mapping.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Candidato;
import com.example.demo.model.Entrevista;
import com.example.demo.model.Tecnologia;

import jakarta.persistence.metamodel.SetAttribute;

@Repository
public class TecnologiaRepository {
    private final EntrevistaRepository entrevistaRepository;
    private final EmpresaRepository empresaRepository;


    @Autowired
    public TecnologiaRepository(EntrevistaRepository entrevistaRepository, EmpresaRepository empresaRepository) {
        this.entrevistaRepository = entrevistaRepository;
        this.empresaRepository = empresaRepository;

    }


    public List<Candidato> buscarUsuariosBemNaTecnologia(Tecnologia tecnologia) {
        List<Candidato> usuariosBemNaTecnologia = new ArrayList<>();

        List<Entrevista> entrevistas = entrevistaRepository.findByTecnologia(tecnologia);
        for (Entrevista entrevista : entrevistas) {
            Candidato candidato = entrevista.getCandidato();
            usuariosBemNaTecnologia.add(candidato);
        }

        return usuariosBemNaTecnologia;
    }
}