package com.loiane.cursojava.exercicios_labs_cinco;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		int[][] numeros = new int[3][3];
		
		Scanner scan = new Scanner(System.in);
		
		int numerosPares = 0, impares = 0;
		
		for(int i = 0; i < numeros.length;i++) {
			System.out.println("Entre com os numeros da " + i + " linha:");
			for(int j = 0; j < numeros[i].length;j++) {
				System.out.println("Entre com o numero da " + j + " coluna:");
				numeros[i][j] = scan.nextInt();
				
				if(numeros[i][j] % 2 == 0) {
					numerosPares++;
				}else {
					impares++;
				}
			}
		}
		
		System.out.println("Numeros digitados:");
		
		for(int i = 0; i < numeros.length;i++) {
			System.out.println("linha " + i + ":");
			for(int j = 0; j < numeros[i].length;j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Quantidade de numeros pares: " + numerosPares + ";\nQuantidade de numeros impares: " + impares + ";");
		

	}

}
