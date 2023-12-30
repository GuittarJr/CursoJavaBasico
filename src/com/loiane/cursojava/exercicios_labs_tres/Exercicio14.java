package com.loiane.cursojava.exercicios_labs_tres;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int par = 0;
		int impar = 0;
		int numero;
		
		System.out.println("Entre com numeros inteiros");
		for(int i = 0; i < 10; i++) {
			System.out.println("Entre com o " + (i+1) + " numero:");
			numero = scan.nextInt();
			if(numero % 2 == 0 ){
				par++;
			}else {
				impar++;
			}
		}
		
		System.out.println("Quantidade de numeros pares: " + par + "\nQuantidade de numeros impares: " + impar);

	}

}
