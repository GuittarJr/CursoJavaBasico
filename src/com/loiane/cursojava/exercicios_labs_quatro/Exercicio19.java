package com.loiane.cursojava.exercicios_labs_quatro;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] nota1 =  new int[10];
		int[] nota2 =  new int[10];
		int[] media =  new int[10];
		int quantidadeAprovado = 0;
		int quantidadeReprovado = 0;
		
		for(int i = 0; i < nota1.length; i++) {
			System.out.println("Entre com a primeira nota do aluno " + (i +1) + ":");
			nota1[i] = scan.nextInt();
			System.out.println("Entre com a segunda nota do aluno " + (i +1) + ":");
			nota2[i] = scan.nextInt();
			media[i] = (nota1[i] + nota2[i])/2;
		}
		
		System.out.println("Result");
		for(int i = 0; i < media.length; i++) {
			if(media[i] >= 7) {
				System.out.println("Aluno " + (i + 1) + ": Aprovado!");
				quantidadeAprovado++;
			}else {
				System.out.println("Aluno " + (i + 1) + ": Reprovado!");
				quantidadeReprovado++;
			}
		}
		
		System.out.println("Quantidade aprovaodos: " + quantidadeAprovado + ";\nQuantidadeReprovado: "+ quantidadeReprovado + ";");

	}

}
