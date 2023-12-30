package com.loiane.cursojava.exercicios_labs_quatro;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[5];
		vetorA[0] = 8;
		vetorA[1] = 16;
		vetorA[2] = 24;
		vetorA[3] = 32;
		vetorA[4] = 40;
		int[] vetorB = new int[5];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i];
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Valor vetorA["+i+"]: " + vetorA[i]);
			System.out.println("Valor vetorB["+i+"]: " + vetorB[i]);
		}

	}

}
