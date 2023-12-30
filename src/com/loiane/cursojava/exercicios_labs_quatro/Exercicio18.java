package com.loiane.cursojava.exercicios_labs_quatro;

public class Exercicio18 {

	public static void main(String[] args) {
		int[] idade = new int[10];
		idade[0] = 12;
		idade[1] = 8;
		idade[2] = 7;
		idade[3] = 8;
		idade[4] = 10;
		idade[5] = 8;
		idade[6] = 8;
		idade[7] = 8;
		idade[8] = 16;
		idade[9] = 22;
		
		int menorIdade = idade[0];
		int indice = 0;
		
		for(int i = 1; i < idade.length;i++) {
			if(idade[i] < menorIdade) {
				menorIdade = idade[i];
				indice = i;
			}
		}
		
		System.out.println("Menor idade: " + menorIdade + ";\nIndice: " + indice );
	}

}
