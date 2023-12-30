package com.loiane.cursojava.exercicios_labs_cinco;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int[][] valores = new int[10][10];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < valores.length;i++) {
			for(int j = 0; j < valores[i].length;j++) {
				System.out.println("Entre com um o valor da linha " + i + " e coluna " + j);
				valores[i][j] = scan.nextInt();
			}
		}
		
		int menorValor = 10;
		int maiorValor = 0;
		
		
		for(int i = 4; i < 6;i++) {
			for(int j = 0; j < valores[i].length;j++) {
				if(valores[i][j] > maiorValor ) {
					maiorValor = valores[i][j];
				}
				
				if(menorValor > valores[i][j]) {
					menorValor = valores[i][j];
				}
			}
			
			
		}
		
		System.out.println(maiorValor);
		System.out.println(menorValor);
		
		for(int i = 6; i < 7;i++) {
			for(int j = 0; j < valores[i].length;j++) {
				if(valores[i][j] > maiorValor ) {
					maiorValor = valores[i][j];
				}
				
				if(menorValor > valores[i][j]) {
					menorValor = valores[i][j];
				}
			}
		}
		System.out.println(maiorValor);
		System.out.println(menorValor);

	}

}
