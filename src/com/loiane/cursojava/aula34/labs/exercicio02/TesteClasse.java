package com.loiane.cursojava.aula34.labs.exercicio02;

import java.util.Scanner;

public class TesteClasse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*System.out.println("Entre com a base:");
        int base = scan.nextInt();
        System.out.println("Entre com a altura:");
        int altura = scan.nextInt();

        System.out.println("ÁREA: " + Calculadora.mult(base,altura) );*/

        System.out.println(Calculadora.pow(2,3));
        System.out.println(Math.pow(2,3));
        System.out.println(Calculadora.fat(4));
    }
}
