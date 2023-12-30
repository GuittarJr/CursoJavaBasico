package com.loiane.cursojava.exercicios_labs_dois;
//App compara e mostra o maior número;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int numero1 = scan.nextInt();
		System.out.println("Digite outro numero:");
		int numero2 = scan.nextInt();
		
		if(numero1 > numero2) {
			System.out.printf("O maior numero e o: %d", numero1);
		}else {
			System.out.printf("O maior numero e o: %d", numero2);
		}

	}

}
