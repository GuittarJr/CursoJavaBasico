package com.loiane.cursojava.exercicios_labs_2;

public class TesteLivro {

	public static void main(String[] args) {
		Livro tarzan = new Livro();
		
		tarzan.autor = "Geovane";
		tarzan.edicao = 2;
		tarzan.distribuidora = "Novatec";
		tarzan.genero = "Aventura";
		
		System.out.println(tarzan.genero);

	}

}
