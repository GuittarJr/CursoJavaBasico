package com.loiane.cursojava.exercicios_labs_dois;
//recebe três numeros inteiros e mostra me ordem decrescente;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		int numero1 = scan.nextInt();
		System.out.println("Digite o segundo numero:");
		int numero2 = scan.nextInt();
		System.out.println("Digite o terceiro numero:");
		int numero3 = scan.nextInt();
		
		int maiorNumero; int numeroDoMeio; int menorNumero;
		
		if(numero1 > numero2 && numero1 > numero3) {
			maiorNumero = numero1;
			if(numero2 > numero3) {
				numeroDoMeio = numero2;
				menorNumero = numero3;
			}else {
				numeroDoMeio = numero3;
				menorNumero = numero2;
			}
		}else if(numero2 > numero1 && numero2 > numero3) {
			maiorNumero = numero2;
			if(numero1 > numero3) {
				numeroDoMeio = numero1;
				menorNumero = numero3;
			}else {
				numeroDoMeio = numero3;
				menorNumero = numero1;
			}
		}else {
			maiorNumero = numero3;
			if(numero2 > numero1) {
				numeroDoMeio = numero2;
				menorNumero = numero1;
			}else {
				numeroDoMeio = numero1;
				menorNumero = numero2;
			}
		}
		
		System.out.printf("Em ordem decrescente\n%d %d %d", maiorNumero, numeroDoMeio,menorNumero);

	}

}
