package com.loiane.cursojava.exercicios_labs_dois;
// Pede um valor inteiro e mostra na tela se o valor é positivo ou negativo;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro:");
		int numero = scan.nextInt();
		
		if(numero >= 0) {
			System.out.println(numero + ": é  positivo!");
		}else {
			System.out.println(numero + ":  negativo!");
		}

	}

}
