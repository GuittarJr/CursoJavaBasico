package com.loiane.cursojava.exercicios_labs_quatro;

public class Exercicio16 {

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
		vetorA[8] = 16;
		vetorA[9] = 22;
		
		int menores = 0;
		int maiorOuIgual = 0;
		int maiores = 1;
		int somaMaiores = 0;
		
		for(int i = 0; i < vetorA.length;i++) {
			if(vetorA[i] < 15) {
				menores += vetorA[i];
			}else {
				if(vetorA[i]> 15) {
					maiores++;
					somaMaiores += vetorA[i];
				}
				maiorOuIgual++;
			}
			
		}
		maiores -= 1;
		double mediaMaiores = 0;
		if(maiores > 0) {
			mediaMaiores = somaMaiores / maiores;
		}else {
			maiores = 1;
		}
		
		
		System.out.println("Soma dos elementos menores que 15: " + menores);
		System.out.println("Soma dos elementos maiores que 15: " + maiores);
		System.out.println("Maiores e iguais a 15: " + maiorOuIgual);
		System.out.println("Media maiores: " + mediaMaiores);
	}

}
