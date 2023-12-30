package com.loiane.cursojava.labs25.Exercicio3;

import java.util.Scanner;

public class TesteClasse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno:");
        aluno.nome = scan.nextLine();

        System.out.println("Entre com o nome do curso:");
        aluno.nomeCurso = scan.nextLine();

        System.out.println("Entre com a matricula:");
        aluno.matricula = scan.nextInt();

        aluno.nomeDisciplinas = new String[3];
        for(int i = 0; i < aluno.nomeDisciplinas.length; i++){
            System.out.println("Entre com o nome da disciplina: " + (i + 1) );
            aluno.nomeDisciplinas[i] = scan.next();
        }

        for(int i = 0; i < aluno.notasDisciplinas.length ;i++){
            System.out.println("Obtendo notas de: " + aluno.nomeDisciplinas[i]);
            for(int j =0; j < aluno.notasDisciplinas[i].length; j++){
                System.out.println("Entre com a nota: " + j);
                aluno.notasDisciplinas[i][j] = scan.nextInt();
            }
        }

        aluno.mostrarInfo();
        aluno.escolherDisciplina();

    }
}
