package com.loiane.cursojava.aula34.labs.exercicio02;

public class Calculadora {
    public static int somar(int num1, int num2){
        return num1 + num2;
    }

    public static double somar(double num1, double num2){
        return num1 + num2;
    }

    public static int mult(int num1, int num2){
        return  num1 * num2;
    }

    public static double sub(double num1, double num2){
        return num1 + num2;
    }

    public static int sub(int num1, int num2){
        return  num1 * num2;
    }

    public static double mult(double num1, double num2){
        return  num1 * num2;
    }

    public static int div(int num1, int num2){
        return  num1/num2;
    }

    public static double div(double num1, double num2){
        return  num1/num2;
    }


    public static double pow(double base , int expo){
        double resultado = 1;
        for(int i = 0; i < expo; i++){
            resultado *= base;
        }

        return resultado;
    }

    public static int fat(int num){
        int resultado = num;
        for(int i = num-1; i > 0; i--){
            resultado *= i;
        }
        return resultado;
    }

}
