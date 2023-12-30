package com.loiane.cursojava.aula13;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
		
		//Adição
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		//Subitração
		resultado = resultado - 1;
		System.out.println(resultado);
		
		//multiplicação
		resultado = resultado * 2;
		System.out.println(resultado);
		
		//divisao
		resultado = resultado / 2;
		System.out.println(resultado);
		
		// --------- Outras operações ------
		
		resultado  = resultado + 8;
		System.out.println(resultado);
		// modulo
		resultado = resultado % 7;
		System.out.println(resultado);
		
		// concatenação de String;
		
		String primeiroTexto = "Esta e ";
		String continuacao = "uma String concatenada!";
		String textoCompleto = primeiroTexto + continuacao;
		System.out.println(textoCompleto);
		

	}

}
