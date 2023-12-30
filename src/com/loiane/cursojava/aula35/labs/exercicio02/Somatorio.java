package com.loiane.cursojava.aula35.labs.exercicio02;

public class Somatorio {

    public  static  int somar(int num){
        if(num < 0){
            return 0;
        }

        return num + somar(num-1);
    }
}
