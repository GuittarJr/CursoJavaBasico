package com.loiane.cursojava.exercicios_labs_um;

import java.util.Scanner;

public class ProgramaSalarioMes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto reecebe por horas ?");
		double valorHora = scan.nextDouble();
		System.out.println("Quantas horas trabalhou este mês?");
		double horasTrabalhadas = scan.nextDouble();
		
		double salarioBruto = valorHora * horasTrabalhadas;
		double inss = salarioBruto * 0.08;
		double ir = salarioBruto * 0.11;
		double sindicato = salarioBruto * 0.05;
		double totalDesconto = inss + ir + sindicato;
		double salarioLiquido = salarioBruto - totalDesconto;
		
		System.out.println("Salario Bruto: " + salarioBruto);
		System.out.println("IR: " + ir);
		System.out.println("INSS: " + inss);
		System.out.println("Sindicato: " +  sindicato);
		System.out.println("Desconto total: " + totalDesconto);
		System.out.println("Salario liquido: " + salarioLiquido);
		
		
	}

}
