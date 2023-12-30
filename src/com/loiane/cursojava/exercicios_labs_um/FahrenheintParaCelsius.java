package com.loiane.cursojava.exercicios_labs_um;

import java.util.Scanner;

public class FahrenheintParaCelsius {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do grau Fahrenheit");
		int fahrenheit = scan.nextInt();
		
		int celsius = 5 * (fahrenheit - 32)/ 9;
		
		System.out.println("O valor do grau Celsius é: " + celsius);
	
	}

}
