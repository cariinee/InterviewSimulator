package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Entrevista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 200, nullable = false)
    private Long pontuacao;
    // @Column(length = 200, nullable = false)
    // private String tecnologia;

    @ManyToOne
    @JoinColumn(name = "candidato_id")
    private Candidato candidato;

    @OneToMany(mappedBy = "entrevista", cascade = CascadeType.ALL)
    private List<Tecnologia> tecnologia;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    private boolean resultado;


}
