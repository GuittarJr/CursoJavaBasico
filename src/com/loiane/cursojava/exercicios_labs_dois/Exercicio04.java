package com.loiane.cursojava.exercicios_labs_dois;

import java.util.Scanner;

//programa verifica se uma letra é vogal ou consoante

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra");
		String letra = scan.next().toLowerCase();
		String resultado;
		
		switch(letra) {
			case "a": 
			case "e": 
			case "i": 
			case "o":
			case "u": resultado = "vogal"; break;
			default: resultado = "consoante";
		}
		System.out.println("O resultado: " + resultado);

	}

}
