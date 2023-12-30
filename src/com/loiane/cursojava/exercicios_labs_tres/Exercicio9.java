package com.loiane.cursojava.exercicios_labs_tres;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 1; i <= 50; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}
