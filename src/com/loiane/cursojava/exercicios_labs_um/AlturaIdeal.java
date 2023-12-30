package com.loiane.cursojava.exercicios_labs_um;

import java.util.Scanner;

public class AlturaIdeal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Este programa calcula sua altura ideal.\n\rDigite sua altura:");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Seu peso ideal é: " + pesoIdeal);
	}

}
