package com.loiane.cursojava.labs25.Exercicio1;

public class Lampada {
    String modelo;
    String cor;
    String marca;
    int voltagem;
    boolean status = false;

    void ligarOuDesligar(){
        this.status = !this.status;
        if(status == true){
            System.out.println("Ligou a lampada!");
        }else{
            System.out.println("Desligou!");
        }
    }
}
