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
            default: conta = new ContaBancaria();
        }

        int opcoes = 2;
        do{
            System.out.println("O que você gostaria de fazer ?");
            System.out.println("1 - fazer um deposito\n2 - Realizar um saque");
            if(conta instanceof ContaPoupanca){
                System.out.println("3 - Verificar rendimento");
            }
            opcoes = scan.nextByte();
        }while(opcoes != 0);

    }
}
