package com.loiane.cursojava.exercicios_labs_um;

import java.util.Scanner;

public class ProgramaDobroAreaQuadrado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da base do quadrado:");
		int base = scan.nextInt();
		
		System.out.println("Digite a altura do quadrado: ");
		double altura = scan.nextDouble();
		
		double area = base * altura;
		double resultado = area * 2;
		
		System.out.println("O dobro da Area do quadrado é: " + resultado);
	}

}
