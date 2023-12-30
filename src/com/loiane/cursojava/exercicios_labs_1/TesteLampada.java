package com.loiane.cursojava.exercicios_labs_1;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada elgin = new Lampada();
		
		elgin.cor = "Branca";
		elgin.marca = "Elgin";
		elgin.modelo = "Led";
		elgin.potencia = 9;
		elgin.preco = 6.52;
		
		System.out.println(elgin.modelo);

	}

}
