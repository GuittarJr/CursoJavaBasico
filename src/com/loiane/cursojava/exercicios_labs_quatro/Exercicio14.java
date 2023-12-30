package com.loiane.cursojava.exercicios_labs_quatro;

public class Exercicio14 {
	public static void main(String[] args) {
		int[] vetorA = new int[10];
		vetorA[0] = 1;
		vetorA[1] = 2;
		vetorA[2] = 3;
		vetorA[3] = 4;
		vetorA[4] = 5;
		vetorA[5] = 6;
		vetorA[6] = 7;
		vetorA[7] = 8;
		vetorA[8] = 9;
		vetorA[9] = 10;
		int soma = 0;
		int quantidade = 0;
		for(int i  = 0; i < vetorA.length;i++) {
			if(vetorA[i] != 0) {
				soma += vetorA[i];
				quantidade++;
			}
		}
		
		int media = soma / quantidade;
		
		System.out.println("Media simples das quantidades de itens: "  + media);
		
	}
}
