package com.loiane.cursojava.aula33.labs.exercicio1;

public class TesteLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada("Philips","Led","Branca",9);

        lampada.mostrarInfo();
        System.out.println();
        lampada.mudarEstado();
        lampada.mostrarInfo();
        System.out.println();
        lampada.mudarEstado();
        lampada.mostrarInfo();
    }
}
