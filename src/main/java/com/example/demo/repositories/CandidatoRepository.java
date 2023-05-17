package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Candidato;
import com.example.demo.model.Tecnologia;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Long>{

    List<Candidato> findAllByOrderByNome();

    List<Candidato> findByPontuacao(Tecnologia tecnologia, int pontuacao);

}
