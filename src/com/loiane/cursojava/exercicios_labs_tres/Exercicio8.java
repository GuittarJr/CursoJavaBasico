package com.loiane.cursojava.exercicios_labs_tres;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		int soma = 0;
		double media = 0;
		for(int i = 0; i < 5; i++){
			System.out.println("Entre com um numero: ");
			numero = scan.nextInt();
			soma += numero;
		};
		media = soma / 5;
		System.out.println("Soma das notas: " + soma + ";\nMedia: " + media + ";" );

	}

}
