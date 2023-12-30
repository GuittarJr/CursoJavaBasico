package com.loiane.cursojava.exercicios_labs_tres;

public class Exercicio4 {

	public static void main(String[] args) {
		long populacaoA = 80000;
		long populacaoB = 200000;
		int resultado = 0;
		
		for(int i = 0; populacaoA <= populacaoB; i++) {
			populacaoA += populacaoA * 0.03;
			populacaoB += populacaoB * 0.015;
			resultado = i;
		}
		
		System.out.println("Quantidade de anos: " + resultado);
	
}

}
