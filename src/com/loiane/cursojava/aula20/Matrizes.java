package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		double[][] notas = new double[3][4];
		
		notas[0][0] = 10;
		notas[0][1] = 7;
		notas[0][2] = 9;
		notas[0][3] = 9.5;
		
		notas[1][0] = 9;
		notas[1][1] = 8;
		notas[1][2] = 7;
		notas[1][3] = 9;
		
		notas[2][0] = 8;
		notas[2][1] = 9;
		notas[2][2] = 10;
		notas[2][3] = 7;
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Aluno"  + (i + 1) + ":");
			for(int j = 0; j < notas[i].length;j++) {
				System.out.println(notas[i][j]);
			}
		}
		
		

	}
	
	

}
