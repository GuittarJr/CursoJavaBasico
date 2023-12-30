package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scan.nextLine(); //Recupera uma linha inteira;
		System.out.println("Seu nome e: " +  nome + ";");

		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();// Recupera um dado do tipo double
		System.out.println("Sua altura e: " + altura + ";");
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next(); //Recupera um texto até que encontre um espaço;
		System.out.println("Seu primeiro nome e: " + primeiroNome + ";");
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt(); //Recupera um dado do tipo inteiro;
		System.out.println("Sua idade e: " + idade + ";");
		
		if(idade > 18) {
			System.out.println("Voce é maior de idade");
		}else {
			System.out.println("Voce ainda e menor de idade");
		}
	}

}
