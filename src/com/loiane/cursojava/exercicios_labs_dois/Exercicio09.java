package com.loiane.cursojava.exercicios_labs_dois;

import java.util.Scanner;

//Pergunta em que turno esta e faz uma saudação

public class Exercicio09 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Em que turno você estuda ?");
		System.out.println("Digite M - para matutino, V - para vespertino e N- para noturno");
		
		
		String turno = scan.next();
		String saudacao;
		
		switch(turno.toUpperCase()) {
			case "M": saudacao = "Bom dia!"; break;
			case "V": saudacao = "Boa Tarde!"; break;
			case "N": saudacao = "Boa Noite!"; break;
			default: saudacao = "Valor invalido!"; break;
		}
		
		System.out.println(saudacao);
		
	}
}
