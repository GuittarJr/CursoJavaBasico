package com.loiane.cursojava.exercicios_labs_dois;
/*
 * @Author: Geovane;
 * Exercicio: ler um numero inteiro e dizer o dia da semana;
 * */
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero:");
		int numero = scan.nextInt();
		String diaDaSemana = "";
		
		switch(numero) {
			case 1: diaDaSemana = "Domingo"; break;
			case 2: diaDaSemana = "Segunda-Feira"; break;
			case 3: diaDaSemana = "Terça-Feira"; break;
			case 4: diaDaSemana = "Quarta-Feira"; break;
			case 5: diaDaSemana = "Quinta-Feira"; break;
			case 6: diaDaSemana = "Sexta-Feira"; break;
			case 7: diaDaSemana = "Sabado"; break;
			default: diaDaSemana = "Entre com um dia válido!";
		}
		
		System.out.println(numero + ": " + diaDaSemana);
	}

}
