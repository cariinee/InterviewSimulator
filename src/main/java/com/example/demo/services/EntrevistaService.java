package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.model.Entrevista;
import com.example.demo.repositories.EntrevistaRepository;

@Service
public class EntrevistaService {
    private final EntrevistaRepository entrevistaRepository;

    public EntrevistaService(EntrevistaRepository entrevistaRepository) {
        this.entrevistaRepository = entrevistaRepository;
    }

    public Entrevista registrarEntrevista(Entrevista entrevista) {
        return entrevistaRepository.save(entrevista);
    }
}
