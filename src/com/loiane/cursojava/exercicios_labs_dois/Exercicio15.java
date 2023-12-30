package com.loiane.cursojava.exercicios_labs_dois;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor de \"a\":");
		int valorA = scan.nextInt();
		
		if(valorA == 0) {
			System.out.println("Esta não é uma equação do primeiro grau!");
		}else {
			System.out.println("Digite o valor de \"b\":");
			int valorB = scan.nextInt();
			System.out.println("Digite o valor de \"c\":");
			int valorC = scan.nextInt();
			
			double delta = Math.pow(valorB, 2) - (4 * valorA * valorC);
			double x1;
			double x2;
			if(delta < 0) {
				System.out.println("A equação não possui raizes reais!");
			}else if(delta == 0) {
				x2 = -valorB - delta/ (2 * valorA);
				System.out.printf("O valor possui apenas uma raiz real \nx2: %.1f",x2);
			}else {
				x1 = (-valorB + Math.sqrt(delta))/(2 * valorA);
				x2 = (-valorB - Math.sqrt(delta))/ (2 * valorA);
				System.out.printf("O valor possui duas raizes reais \nx1: %.1f\nx2: %.1f",x1,x2);
			}
		}

	}

}
