package com.loiane.cursojava.aula33;

public class MinhaCalculadora {
    public int soma(int num1, int num2){
        return num1 + num2;
    }
    public double soma(double num1, double num2){
        return num1 + num2;
    }
    public int soma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public int soma(int[] numeros){
        int tamanho = numeros.length;
        int soma = 0;

        for(int i = 0; i < tamanho; i++){
            soma += numeros[i];
        }

        return soma;
    }


    public static void main(String[] args) {
        MinhaCalculadora calculadora = new MinhaCalculadora();
        int[] numeros = {1,2,3,4,5};

        int resultado = calculadora.soma(numeros);

        System.out.println(resultado);
    }

}
