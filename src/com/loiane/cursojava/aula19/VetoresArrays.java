package com.loiane.cursojava.aula19;



public class VetoresArrays {

	public static void main(String[] args) {
		//Array Estrutura de dados simples;
		//precisa indicar o tamanho do array no java;
		
		double[] temperatura = new double[365];
		
		temperatura[0] = 12.5;
		temperatura[1] = 22.0;
		temperatura[2] = 45.0;
		temperatura[3] = 55;
		
		for(int i = 0; i < temperatura.length; i++) {
			System.out.println("Temperatura do dia " + (i+1) + " e: " + temperatura[i]);
			if(temperatura[i + 1] == 0) {
				break;
			}
		}
		
		
	}

}
