package com.loiane.cursojava.exercicios_labs_dois;

/*
 * @Author: Geovane Dos Santos
 * Programa lê duas notas parciais do aluno, calcula média e atribui as letras das respectivas notas "A,B..D"
 * */

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.println("Entre com a segunda nota: ");
		double nota2 = scan.nextDouble();
		String conceito = "";
		String status = "";
		
		double media = (nota1 + nota2) / 2;
		if(media >= 9 && media < 10) {
			conceito = "A";
			status = "Aprovado!";
		}else if(media >= 7.5 && media < 9) {
			conceito = "B";
			status = "Aprovado!";
		}else if(media >= 6 && media < 7.5) {
			conceito = "C";
			status = "Aprovado!";
		}else if(media >= 4 && media < 6) {
			conceito = "D";
			status = "Reprovado!";
		}else if(media >= 0 && media < 4) {
			conceito = "E";
			status = "Reprovado!";
		}
		
		System.out.printf("Primeira nota: %.1f\nSegunda nota: %.1f\n",nota1,nota2);
		System.out.printf("Media: %.1f\nConceito: %s\nStatus: %s",media,conceito,status);

	}

}
