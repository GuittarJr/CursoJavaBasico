package com.loiane.cursojava.exercicios_labs_um;

import java.util.Scanner;

public class ConversorMetroCentimetro {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Entrada de dados:
		System.out.println("Digite o tamanho em metro: ");
		double metro = scan.nextDouble();
		
		//processamento de dados:
		double centimetro = metro * 10;
		
		//saída de dados: 
		System.out.println("Resultado em centimetro: " + centimetro);
		

	}

}
