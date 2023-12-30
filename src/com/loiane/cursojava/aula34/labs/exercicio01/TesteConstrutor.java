package com.loiane.cursojava.aula34.labs.exercicio01;

public class TesteConstrutor {
    public static void main(String[] args) {
        Construtor construtor1 = new Construtor();
        Construtor construtor2 = new Construtor();
        Construtor.zerarNumInstancias();
        Construtor.mostrarNumInstacias();
    }
}
