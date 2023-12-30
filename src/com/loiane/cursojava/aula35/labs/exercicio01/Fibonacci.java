package com.loiane.cursojava.aula35.labs.exercicio01;

public class Fibonacci {
    public static int fibbonaci(int num){
        if(num < 2){
            return 1;
        }
        return fibbonaci(num -1)  + fibbonaci(num - 2);
    }
}
