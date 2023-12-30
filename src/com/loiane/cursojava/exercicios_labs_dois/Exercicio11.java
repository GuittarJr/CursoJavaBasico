package com.loiane.cursojava.exercicios_labs_dois;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto recebe por horas ?");
		int valorHora = scan.nextInt();
		System.out.println("Quantidade de horas trabalhadas ?");
		int horasTrabalhadas = scan.nextInt();

		double salarioBruto = valorHora * horasTrabalhadas;
		double ir;
		double inss = salarioBruto * 0.10;
		double fgts = salarioBruto * 0.11;
		
		if(salarioBruto <= 900) {
			ir = salarioBruto * 0;
		}else if(salarioBruto <= 1500) {
			ir = salarioBruto * 0.05;
		}else if(salarioBruto <= 2500) {
			ir = salarioBruto * 0.10;
		}else {
			ir = salarioBruto * 0.20;
		}
		
		double totalDesconto = ir + fgts;
		double salarioLiquido = salarioBruto - totalDesconto;
		
		System.out.printf("Salario Bruto: %.2f\nIR: %.2f\nINSS: %.2f\nFGTS %.2f\nTotal de descontos: %.2f\nSalario liquido: %.2f",salarioBruto, ir,inss,fgts,totalDesconto, salarioLiquido);
	}

}
