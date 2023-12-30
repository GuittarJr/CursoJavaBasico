package com.loiane.cursojava.exercicios_labs_tres;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a base:");
		int base = scan.nextInt();
		System.out.println("Entre com o expoente:");
		int expoente = scan.nextInt();
		
		int resultado = 1;
		
		for(int i = 0; i < expoente; i++) {
			resultado *= base;
		}
		System.out.println("Resultado: " + resultado);

	}

}
