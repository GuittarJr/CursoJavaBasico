package com.loiane.cursojava.exercicios_labs_um;

import java.util.Scanner;

public class ProgramaSoma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Este programa recebe dois numeros inteiros e faz a soma.");
		System.out.println("Digite um numero: ");
		int numero1 = scan.nextInt();
		System.out.println("Digite um outro numero: ");
		int numero2 = scan.nextInt();
		
		int soma = numero1 + numero2;
		System.out.println("O resultado da soma dos numeros e: " + soma);
	}

}
