package com.loiane.cursojava.exercicios_labs_quatro;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] idade = new int[10];
		int meta = 0;
		
		for(int i = 0; i < idade.length; i++) {
			System.out.println("Entre com sua idade:");
			idade[i] = scan.nextInt();
			if(idade[i] > 35) {
				meta++;
			}
		}
		
		System.out.println("Quantidade de pessoas com idade maiores que 35: " + meta );
		
		

	}

}
