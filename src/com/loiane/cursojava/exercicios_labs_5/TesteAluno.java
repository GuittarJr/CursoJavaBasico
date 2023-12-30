package com.loiane.cursojava.exercicios_labs_5;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno pessoa = new Aluno();

        pessoa.name = "Geovane";
        pessoa.age = 25;
        pessoa.hobbies = new String[2];
        pessoa.hobbies[0] = "Jogar Video-Games";
        pessoa.hobbies[1] = "Assistir filmes e Séries de TV";

        pessoa.apresentacao();
    }
}
