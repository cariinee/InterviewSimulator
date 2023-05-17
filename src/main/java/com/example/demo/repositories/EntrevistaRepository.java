package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Entrevista;
import com.example.demo.model.Tecnologia;

@Repository
public interface EntrevistaRepository extends JpaRepository<Entrevista, Long> {
    List<Entrevista> findByTecnologia(Tecnologia tecnologia);

}
