package com.loiane.cursojava.exercicios_labs_um;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Digite o valor do Grau Celsius");
		int celsius = scan.nextInt();
		
		double fahrenheint = celsius * 1.8 + 32;
		
		System.out.println("O valor de fahrenheit: " + fahrenheint + "°F");

	}

}
