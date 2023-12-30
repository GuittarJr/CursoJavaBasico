package com.loiane.cursojava.aula37;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Geovane");
        aluno.setCpf("3322112");
        System.out.println(aluno.getNome());
        aluno.setTelefone("222111222");
    }
}
