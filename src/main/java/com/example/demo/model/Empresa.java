package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 200, nullable = false)
    private String nome;
    @Column(length = 200, nullable = false)
    private String cnpj;
    @Column(length = 200, nullable = false)
    private String email;
    @Column(length = 200, nullable = false)
    private String telefone;
    @Column(length = 200, nullable = false)
    private String endereco;

    @OneToMany(mappedBy = "empresa")
    private List<Tecnologia> tecnologias;

    public boolean temAcessoTecnologia(Tecnologia tecnologia) {
        // Implemente as regras de negócio para verificar se a empresa tem acesso à tecnologia.
        // Por exemplo, verifique se a empresa possui um relacionamento com a tecnologia.
        return this.tecnologias.contains(tecnologia);
    }
 
}
