package com.loiane.cursojava.exercicios_labs_tres;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;
		
		do {
			System.out.println("Entre com o nome: ");
			nome = scan.next();
			if(nome.length() < 3) {
				System.out.println("Formato invalido!, o campo de nome deve ser maior que 3 caracteres");
			}
		}while(nome.length() < 3);
		do {
			System.out.println("Digite sua idade: ");
			idade = scan.nextInt();
			if(idade < 0 || idade > 150) {
				System.out.println("Formato invalido de idade!");
			}
		}while(idade < 0 || idade > 150);
		do {
			System.out.println("Entre com seu salario");
			salario = scan.nextDouble();
			if(salario < 0) {
				System.out.println("Salario deve ser maior que zero!");
			}
		}while(salario < 0);
		do {
			System.out.println("Digite \"F\" ou \"M\" para informar seu genero");
			sexo = scan.next();
			if(!sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("M")) {
				System.out.println("Digite um valor valido");
			}
		}while(!sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("M"));
		do {
			System.out.println("Entre com seu estado civil 'S', 'C', 'V', 'D'");
			estadoCivil = scan.next();
			if(
					!estadoCivil.equalsIgnoreCase("S") && !estadoCivil.equalsIgnoreCase("C")&&
					!estadoCivil.equalsIgnoreCase("V") && !estadoCivil.equalsIgnoreCase("D")
					) {
				System.out.println("Digite um valor valido");
			}
		}while(!estadoCivil.equalsIgnoreCase("S") && !estadoCivil.equalsIgnoreCase("C")&&
				!estadoCivil.equalsIgnoreCase("V") && !estadoCivil.equalsIgnoreCase("D"));
		
		System.out.println("Registro completo");
		System.out.printf("Nome: %s;\nIdade: %d;\nSalario: %.2f;\nSexo: %s;\nEstado Civil: %s;",nome,idade,salario,sexo,estadoCivil);
	}
}
