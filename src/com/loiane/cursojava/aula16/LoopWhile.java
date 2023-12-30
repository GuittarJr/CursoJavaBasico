package com.loiane.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
		int i = 0;
		while(i <= 10) {
			System.out.println("Numero: " + i);
			i++;
		}
		
		do {
			i++;
			System.out.println(i);
		}while(i < 15);
		
		System.out.println(i);
	}
}
