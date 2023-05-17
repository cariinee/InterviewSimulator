package com.example.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.model.Tecnologia;



@Repository
public interface TecnologiaRepository extends JpaRepository<Tecnologia, Long>{

    Tecnologia getTecnologiaById(Long id);


}