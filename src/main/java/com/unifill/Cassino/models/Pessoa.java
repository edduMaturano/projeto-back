package com.unifill.Cassino.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    private Integer pontuacao;


    private List<Cartas> cartas;

    public Pessoa(){
    }

    public Pessoa(String nome, Integer pontuacao){
        this.nome = nome;
        this.pontuacao = pontuacao;
    }
}
