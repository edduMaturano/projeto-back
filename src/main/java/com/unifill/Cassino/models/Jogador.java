package com.unifill.Cassino.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Jogador extends Pessoa {

    private double saldo;

    public Jogador(){
    }
    public Jogador(String nome, Integer pontuacao){
        super(nome, pontuacao);
        this.saldo = 0;
    }

}
