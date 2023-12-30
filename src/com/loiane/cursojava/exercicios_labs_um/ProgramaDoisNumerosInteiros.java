package com.loiane.cursojava.exercicios_labs_um;

import java.util.Scanner;

public class ProgramaDoisNumerosInteiros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int numero1 = scan.nextInt();
		System.out.println("Digite outro numero inteiro: ");
		int numero2 = scan.nextInt();
		
		int resultado1 = numero1 * 2 + numero2 / 2;
		int resultado2 = numero1 * 3 + resultado1;
		int resultado3 = (int) Math.pow(resultado1, 3);
		
		System.out.println("O produto do dobro do primeiro com a metade do segundo: " + resultado1);
		System.out.println("A soma do triplo do primeiro com o terceiro: " + resultado2);
		System.out.println("O terceiro elevado ao cubo: " + resultado3);
		
	}

}
