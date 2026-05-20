package com.unifill.Cassino.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Distribuidor extends Pessoa {
    private Boolean ativo;


    public  Distribuidor(String nome, Integer pontuacao, Boolean ativo){
        super(nome, pontuacao);
        this.ativo = ativo;
    }
}
