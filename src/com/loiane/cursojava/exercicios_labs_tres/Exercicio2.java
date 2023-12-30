package com.loiane.cursojava.exercicios_labs_tres;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String usuario;
		String senha;
		
		do {
			System.out.println("Digite o usuario: ");
			usuario = scan.next();
			System.out.println("Digite sua senha: ");
			senha = scan.next();
			
			if(usuario.equalsIgnoreCase(senha)) {
				System.out.println("Usuario e Senha não podem ser iguais");
			}
		}while(usuario.equalsIgnoreCase(senha));
		
		System.out.println("Login efetuado com sucesso!");
	}

}
