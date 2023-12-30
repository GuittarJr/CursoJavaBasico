package com.loiane.cursojava.exercicios_labs_tres;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int resultado = 0;
		int numero;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Entre com um número: ");
			numero = scan.nextInt();
			if(numero > resultado) {
				resultado = numero;
			}
		}
		
		System.out.println("O maior número é: " + resultado);

	}

}
