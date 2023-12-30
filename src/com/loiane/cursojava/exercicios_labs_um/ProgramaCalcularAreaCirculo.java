package com.loiane.cursojava.exercicios_labs_um;

import java.util.Scanner;

public class ProgramaCalcularAreaCirculo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o Raio do circulo: ");
		int raio = scan.nextInt();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A Area do circulo e: " + area);
	}

}
