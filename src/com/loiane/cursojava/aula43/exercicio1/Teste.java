package com.loiane.cursojava.aula43.exercicio1;

import com.loiane.cursojava.aula15.SwitchCase;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Entre com o tipo de conta:\n1 - Conta Poupança\n2 - Conta Especial");
             escolha = scan.nextByte();
        }while (escolha < 0 && escolha > 2);

        ContaBancaria conta;
        switch (escolha){
            case 1: conta = new ContaPoupanca(0.20); break;
            case 2: conta = new ContaEspecial(); break;
            default: conta = new ContaPoupanca(0.0);
        }

        int opcoes = 5;

        System.out.println("O que você gostaria de fazer ?");
        System.out.println("1 - fazer um deposito\n2 - Realizar um saque");
        System.out.println("3 - Mostrar informações");
        if(conta instanceof ContaPoupanca){
            System.out.println("4 - Mostrar Rendimento");
        }
        opcoes = scan.nextByte();

       if(opcoes == 1){
           conta.fazerDeposito();
       } else if (opcoes == 2) {
           conta.sacarDinheiro();
       } else if (opcoes == 3) {
           conta.toString();
       } else if (conta instanceof ContaPoupanca && opcoes == 4) {
           conta.getDiaRendimento();
       }else {
           System.out.println("Não foi possível identificar o que você está procurando!");
       }

    }

}
