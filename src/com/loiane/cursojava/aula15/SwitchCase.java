package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero de 1 a 7:");
		int numero = scan.nextInt();
		String diaDaSemana;
		
		switch(numero) {
			case 1: diaDaSemana = "Domingo";
			break;
			case 2: diaDaSemana = "Segunda-feira";
			break;
			case 3: diaDaSemana = "Terça-feira";
			break;
			case 4: diaDaSemana = "Quarta-feira";
			break;
			case 5: diaDaSemana = "Quinta-feira";
			break;
			case 6: diaDaSemana = "Sexta-feira";
			break;
			case 7: diaDaSemana = "Sabado";
			break;
			default: diaDaSemana = "Estre com um dia valido!";
		}
		
		System.out.printf("Dia da semana: %s;" ,diaDaSemana);
	}

}
