package com.example.demo.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Candidato;
import com.example.demo.model.Entrevista;
import com.example.demo.model.Tecnologia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface TecnologiaRepository extends JpaRepository<Tecnologia, Long>{

    Tecnologia getTecnologiaById(Long id);


}