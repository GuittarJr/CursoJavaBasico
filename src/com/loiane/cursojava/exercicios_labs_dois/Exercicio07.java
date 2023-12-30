package com.loiane.cursojava.exercicios_labs_dois;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro preço:");
		double preco1 = scan.nextDouble();
		System.out.println("Digite o segundo preço:");
		double preco2 = scan.nextDouble();
		System.out.println("Digite o terceiro preço:");
		double preco3 = scan.nextDouble();
		
		double menorPreco;
		if(preco1 < preco2 && preco1 < preco3) {
			menorPreco = preco1;
		}else if(preco2 < preco1 && preco2 < preco3) {
			menorPreco = preco2;
		}else {
			menorPreco = preco3;
		}
		
		System.out.println("O menor preço é: " + menorPreco);
	}

}
