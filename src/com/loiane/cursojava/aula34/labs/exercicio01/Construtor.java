package com.loiane.cursojava.aula34.labs.exercicio01;

public class Construtor {
    static int numInstacias = 0;

    public Construtor() {
        numInstacias++;
    }

    public static void mostrarNumInstacias(){
        System.out.println("Quantidade de instancias: " + numInstacias);
    }

    public static void zerarNumInstancias(){
        numInstacias = 0;
    }

}
