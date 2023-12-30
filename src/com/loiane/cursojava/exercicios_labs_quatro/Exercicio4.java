package com.loiane.cursojava.exercicios_labs_quatro;

public class Exercicio4 {

	public static void main(String[] args) {
		int[] vetorA = new int[15];
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
		vetorA[10] = 11;
		vetorA[11] = 12;
		vetorA[12] = 13;
		vetorA[13] = 14;
		vetorA[14] = 15;
		double[] vetorB = new double[15];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Valor vetorA["+i+"]: " + vetorA[i]);
			System.out.printf("Valor vetorB["+i+"]: %.2f\n", vetorB[i]);
		}

	}

}
