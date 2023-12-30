package com.loiane.cursojava.labs25.Exercicio1;
public class TesteClasse {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.marca = "Philips";
        lampada.cor = "Branca";
        lampada.modelo = "Led";
        lampada.voltagem = 9;
        lampada.ligarOuDesligar();
        lampada.ligarOuDesligar();
        lampada.ligarOuDesligar();
    }
}
