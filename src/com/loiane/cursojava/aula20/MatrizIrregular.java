package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o numero de pessoas entrevistadas");
		int numEntrevistados = scan.nextInt();
		
		String[][] nomesDosFilhos = new String[numEntrevistados][];
		
		int qtdFilhos;
		
		for(int i = 0; i < nomesDosFilhos.length; i++) {
			
			System.out.println("Entre com a quantidade de filhos da pessoa " + (i +1));
			qtdFilhos = scan.nextInt();
			
			nomesDosFilhos[i] = new String[qtdFilhos];
			
			for(int j = 0; j < nomesDosFilhos[i].length;j++) {
				System.out.println("Digite o nome do filho " + (j+1));
				nomesDosFilhos[i][j] = scan.next();
			}
	
		}
		
		for(int i = 0; i < nomesDosFilhos.length; i++) {
			System.out.println("Pessoa " + (i + 1) + " possui " + nomesDosFilhos[i].length + ":");
			for(int j = 0; j < nomesDosFilhos[i].length; j++) {
				System.out.println(nomesDosFilhos[i][j]);
			}
		}
		

	}

}
