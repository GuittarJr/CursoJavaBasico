package com.loiane.cursojava.exercicios_labs_tres;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero inteiro de 1 a 10");
		int numero = scan.nextInt();
		
		System.out.println("Tabuada de " + numero);
		for(int i = 1; i <= 10; i++) {
			System.out.println(numero + " X " + i + " = " + (numero * i));
		}

	}

}
