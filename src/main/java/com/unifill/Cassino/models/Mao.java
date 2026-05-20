package com.unifill.Cassino.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Mao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer pontuacao;

    private String status;

    @ManyToOne
    private Jogador jogador;

    public Mao(){
    }
    public Mao(Integer pontuacao,String status ,Jogador jogador){
        this.pontuacao = pontuacao;
        this.status = status;
        this.jogador = jogador;
    }
}
