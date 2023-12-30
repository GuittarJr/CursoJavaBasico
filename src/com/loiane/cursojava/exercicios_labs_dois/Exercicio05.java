package com.loiane.cursojava.exercicios_labs_dois;

import java.util.Scanner;

/* O programa diz se o aluno foi aprovado ou não dependendo da sua média
 * Se o valor for igual ou maior que 7 o aluno esta aprovado;
 * Reprovado se for menor que 7;
 * E aprovado com distinção se for == 10;
 */

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		int nota1 = scan.nextInt();
		System.out.println("Digite a segunda nota:");
		int nota2 = scan.nextInt();
		
		double media = (nota1 + nota2) / 2;
		
		if(media == 10) {
			System.out.println("Aprovado com distinção!");
		}else if(media >= 7 && media < 10) {
			System.out.println("Aprovado!");
		}else {
			System.out.println("Reprovado!");
		}

	}

}
