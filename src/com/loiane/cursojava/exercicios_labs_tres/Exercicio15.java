package com.loiane.cursojava.exercicios_labs_tres;

public class Exercicio15 {

	public static void main(String[] args) {
		
		int pastNumber = 0, newNumber = 1;
		
		System.out.println("Sequencia de fibonacci!");
		for(int i = 0; i < 10; i++) {
			System.out.println(pastNumber);
			int temp = pastNumber + newNumber;
			pastNumber = newNumber;
			newNumber = temp;
		}
	}

}
