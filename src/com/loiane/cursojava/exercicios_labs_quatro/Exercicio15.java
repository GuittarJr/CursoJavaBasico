package com.loiane.cursojava.exercicios_labs_quatro;

public class Exercicio15 {

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
		
		int valoresPares = 0;
		int valoresImpares = 0;
		
		for(int i = 0; i < vetorA.length;i++) {
			if(vetorA[i] % 2 == 0) {
				valoresPares++;
			}else {
				valoresImpares++;
			}
		}
		
		int quantidadePares = valoresPares * vetorA.length;
		int quantidadeImpares = valoresImpares * vetorA.length;
		
		System.out.println("Quantidade valores pares: " + quantidadePares + "%;");
		System.out.println("Quantidade valores pares: " + quantidadeImpares + "%;");
	}

}
