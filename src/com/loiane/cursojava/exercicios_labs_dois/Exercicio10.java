package com.loiane.cursojava.exercicios_labs_dois;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu sálario:");
		
		double salario = scan.nextDouble();
		double reajuste;
		String porcentagem;
		double salarioNovo;
		
		if(salario > 0 && salario <= 280) {
			reajuste = salario * 0.20;
			porcentagem = "20%";
		}else if(salario > 280 && salario < 700) {
			reajuste = salario * 0.15;
			porcentagem = "15%";
		}else if(salario >= 700 && salario < 1500) {
			reajuste = salario * 0.10;
			porcentagem = "10%";
		}else {
			reajuste = salario * 0.05;
			porcentagem = "5%";
		}
		
		salarioNovo = salario + reajuste;
		System.out.printf("Salario antes do reajuste: %.2f\nPercentual de aumento aplicado: %s\n", salario, porcentagem);
		System.out.printf("Valor do aumento: %.2f\nNovo salario: %.2f", reajuste, salarioNovo);
	}

}
