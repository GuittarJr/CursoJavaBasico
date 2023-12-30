package com.loiane.cursojava.exercicios_labs_tres;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o numero inicial:");
		int begginNumber = scan.nextInt();
		System.out.println("Entre com o numero final: ");
		int endNumber = scan.nextInt();
		
		System.out.println("Intervalos entre eles");
		for(int i = begginNumber + 1; i < endNumber; i++ ) {
			System.out.println(i);
		}

	}
}
