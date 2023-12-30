package com.loiane.cursojava.exercicios_labs_tres;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		int nota = -1;
		
		while(nota < 0 || nota > 10) {
			System.out.println("Entre com uma nota de 0 a 10");
			nota = scan.nextInt();
		}
		
		System.out.println("Nota: " + nota);
	}

}
