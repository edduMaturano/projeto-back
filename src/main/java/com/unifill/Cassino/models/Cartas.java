package com.unifill.Cassino.models;
import java.util.Map;
import java.util.HashMap;

public class Cartas {
    Map<String, Integer> cartas = new HashMap<>();

    private Cartas(int mao){
        cartas.put("As", 1);
        cartas.put("2", 2);
        cartas.put("3", 3);
        cartas.put("4", 4);
        cartas.put("5", 5);
        cartas.put("6", 6);
        cartas.put("7", 7);
        cartas.put("8", 8);
        cartas.put("9", 9);
        cartas.put("10", 10);
        cartas.put("Q", 10);
        cartas.put("J", 10);
        cartas.put("K", 10);
    }
    private int getValue(int valorMao){
        return valorMao>10 ? 1 :11;
    }
}
