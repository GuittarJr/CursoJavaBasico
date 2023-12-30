package com.loiane.cursojava.aula33.labs.exercicio2;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(2,true);
        contaCorrente.obterLimite();

        contaCorrente.depositarDinheiro();
        contaCorrente.sacarDinheiro(80);
        double saldo = contaCorrente.getSaldo();
        double limite = contaCorrente.getLimite();


        System.out.println("Seu saldo atual: " + saldo);
        System.out.println("Seu limite atual: " + limite);

   }
}
