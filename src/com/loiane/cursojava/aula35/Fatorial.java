package com.loiane.cursojava.aula35;

public class Fatorial {
    public static int calcularFatorial(int num){
        if(num == 0){
            return 1;
        }
        return num * calcularFatorial(num - 1);
    }
}
