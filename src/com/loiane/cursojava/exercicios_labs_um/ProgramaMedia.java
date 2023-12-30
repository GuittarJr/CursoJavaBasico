package com.loiane.cursojava.exercicios_labs_um;

import java.util.Scanner;

public class ProgramaMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Este programa recebe 4 numeros e calcula a media.");
		
		// entrada de dados:
		System.out.println("Digite a primeira nota: ");
		int nota1 = scan.nextInt();
		System.out.println("Digite a segunda nota: ");
		int nota2 = scan.nextInt();
		System.out.println("Digite a terceira nota: ");
		int nota3 = scan.nextInt();
		System.out.println("Digite a quarta nota: ");
		int nota4 = scan.nextInt();
		
		// processamento:
		int total = nota1 + nota2 + nota3 + nota4;
		double media = total / 4;
		
		// saida de dados:
		System.out.println("A media total das notas e: " + media);
	

	}

}
