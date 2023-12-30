package com.loiane.cursojava.exercicios_labs_dois;
/*
 * programa pede 3 lados de um triangulo, informa se pode ser um triangulo,
 * caso formem um triangulo indica se o mesmo é: equilátero,isóceles ou escaleno.
 * */
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro lado:");
		int lado1 = scan.nextInt();
		System.out.println("Entre com o segundo lado:");
		int lado2 = scan.nextInt();
		System.out.println("Entre com o terceiro lado:");
		int lado3 = scan.nextInt();
		
		String resposta = "";
		Boolean possibilidade1 = (lado1 + lado2) <= lado3;
		Boolean possibilidade2 = (lado2 + lado3) <= lado1;
		Boolean possibilidade3 = (lado1 + lado3) <= lado2;
		
		if(possibilidade1 && possibilidade2 && possibilidade3){
			resposta = "Não forma um triangulo";
		}else {
			Boolean equilatero = lado1 == lado2 && lado1 == lado3;
			Boolean isoceles = lado1 == lado2 || lado2 == lado3 || lado1 == lado3;
			if(equilatero) {
				resposta = "Equilatero";
			}else if(isoceles) {
				resposta = "Isoceles";
			}else {
				resposta = "Escaleno";
			}
		}
		
		System.out.println(resposta);

	}

}
