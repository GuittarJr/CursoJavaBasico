package com.loiane.cursojava.exercicios_labs_um;

import java.util.Scanner;

public class ProgramaNumeroInformado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = scan.nextInt();
		
		System.out.println("O numero informado foi: " + numero);

	}

}
