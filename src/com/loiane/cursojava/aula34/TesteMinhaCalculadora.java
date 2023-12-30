package com.loiane.cursojava.aula34;

public class TesteMinhaCalculadora {
    public static void main(String[] args) {
        int[] numeros = {2,3,4};
        System.out.println(MinhaCalculadora.soma(2.3,2.4));
        System.out.println(MinhaCalculadora.soma(1,2));
        System.out.println(MinhaCalculadora.soma(1,2,3));
        System.out.println(MinhaCalculadora.soma(numeros));
    }
}
