package com.loiane.cursojava.exercicios_labs_cinco;

public class Exercicio1 {

	public static void main(String[] args) {
		int[][] aleatoria = {{1,2,4,5},{2,34,53,2},{12,4,3,5},{2,3,4,5}};
		
		int maiorNumero = 0;
		int linha = 0;
		int coluna = 0;
		
		for(int i = 0; i < aleatoria.length; i++) {
			System.out.println("Linha " + i + ":");
			for(int j = 0;j < aleatoria[i].length; j++) {
				System.out.print(aleatoria[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < aleatoria.length; i++) {
			for(int j = 0;j < aleatoria[i].length; j++) {
				if(aleatoria[i][j] > maiorNumero) {
					maiorNumero = aleatoria[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		
		System.out.println("Maior numero: " + maiorNumero + ";\nLinha: " + linha + ";\nColuna: "  + coluna + ";" );
	}

}
