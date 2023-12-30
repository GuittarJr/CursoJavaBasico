package com.loiane.cursojava.exercicios_labs_dois;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o ano:");
		int ano = scan.nextInt();
		
		if(ano % 4 == 0) {
			if(ano % 100 != 0 || ano % 400 == 0) {
				System.out.println("e bissexto!");
			}else {
				System.out.println("nao e bissexto");
			}
		}else {
			System.out.println("nao e bissexto!");
		}
	}

}
