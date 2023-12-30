package com.loiane.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		
		int[] notas = new int[10];
		
		Random random = new Random();
		for(int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(10);
		}
		
		int maiorQueCinco = 0;
		for(int nota : notas) {
			System.out.println(nota);
			if(nota > 5) {
				maiorQueCinco++;
			}
		}
		
		System.out.println("Maiores que cinco: " + maiorQueCinco);
		

	}

}
