package com.loiane.cursojava.exercicios_labs_tres;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int populacaoB;
		int populacaoA;
		double taxaA;
		double taxaB;
		int resultado = 0;
		do {
			System.out.println("Entre com o valor da populacao A: ");
			populacaoA = scan.nextInt();
			System.out.println("Entre com o valor da populacaoB: ");
			populacaoB = scan.nextInt();
			if(populacaoA > populacaoB) {
				System.out.println("A populacao A deve ser menor que a populacao B!");
			}
		}while(populacaoB < populacaoA);
			System.out.println("Entre com a taxa de crescimento do valor A: ");
			taxaA = scan.nextDouble();
			System.out.println("Entre com a taxa de crescimento do valor B: ");
			taxaB = scan.nextDouble();
			
		
		for(int i = 0; populacaoA <= populacaoB; i++) {
			populacaoA += populacaoA/100 * taxaA;
			populacaoB += populacaoB/100 * taxaB;
			resultado = i;
		}
		
		System.out.println("Quantidade de anos: " + resultado);
		
		

	}

}
