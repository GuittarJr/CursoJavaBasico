package com.loiane.cursojava.exercicios_labs_um;

import java.util.Scanner;

public class ProgramaSalario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por horas?");
		double valorHora = scan.nextDouble();
		System.out.println("Quantas horas você trabalhou este mês ?");
		int quantidadeHoras = scan.nextInt();
		
		double salario = valorHora * quantidadeHoras;
		
		System.out.println("Seu salario é R$:" + salario);

	}

}
