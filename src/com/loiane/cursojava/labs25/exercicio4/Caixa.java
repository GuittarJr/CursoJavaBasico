package com.loiane.cursojava.labs25.exercicio4;

import java.util.Scanner;

public class Caixa {
    Produto[] produtos = new Produto[3];

    Scanner scan = new Scanner(System.in);

    public void adicionarProduto(){
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Objeto " + (i + 1));

            // Pedir ao usuário os dados
            System.out.print("Nome: ");
            String nome = scan.next();

            System.out.print("Preco: ");
            double preco = scan.nextDouble();

            System.out.print("Quantidade: ");
            int quantidade = scan.nextInt();

            // Criar e adicionar o objeto ao array
            produtos[i] = new Produto(nome,preco,quantidade);
        }
    }

    public void mostrarProdutos(){
        for(int i = 0; i < produtos.length; i++){
            System.out.println("Produto: " + produtos[i].nome + "; Preco: " + produtos[i].preco + "; Quantidade em estoque :" + produtos[i].estoque);
        }
    }
}
