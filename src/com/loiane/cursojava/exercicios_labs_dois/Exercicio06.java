package com.loiane.cursojava.exercicios_labs_dois;

import java.util.Scanner;

//Programa lê 3 entradas de numeros inteiros diferentes e mostra o maior deles;
public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero1 = scan.nextInt();
		System.out.println("Digite outro numero diferente:");
		int numero2 = scan.nextInt();
		System.out.println("Digite outro numero diferente:");
		int numero3 = scan.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3) {
			System.out.println(numero1 + " e o maior numero;");
		}else if(numero2 > numero1 && numero2 > numero3) {
			System.out.println(numero2 + " e o maior numero;");
		}else {
			System.out.println(numero3 + " e o maior numero;");
		}

	}

}
