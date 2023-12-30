package com.loiane.cursojava.labs25.Exercicio3;

import java.util.Scanner;

public class Aluno{
    Scanner scan = new Scanner(System.in);
    String nome;
    int matricula;
    String nomeCurso;
    String[] nomeDisciplinas;
    int[][] notasDisciplinas = new int[3][4];

    void mostrarInfo(){
        System.out.println("Nome do aluno: " + this.nome);
        System.out.println("Nome do curso: " + this.nomeCurso);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Disciplinas: ");

        for(int i = 0; i < notasDisciplinas.length; i++){
            System.out.println((i+1) + "° " + nomeDisciplinas[i]);
            System.out.println("Nota das disciplinas: ");
            for(int j = 0; j < notasDisciplinas[i].length; j++){
                System.out.print(notasDisciplinas[i][j] + " ");
            }
            System.out.print(";");
            System.out.println();
        }


    }

    void escolherDisciplina(){
        System.out.println("Para obter o resultado do seu desempenho escolha uma disciplina:");
        for (int i = 0; i < this.nomeDisciplinas.length; i++){
            System.out.println((i + 1) + " - " + nomeDisciplinas[i]);
        }

        int escolha = scan.nextInt();
        String resultado = "";
        switch (escolha){
            case 1: resultado = calcularMedia(notasDisciplinas[0]); break;
            case 2: resultado =calcularMedia(notasDisciplinas[1]); break;
            case 3: resultado = calcularMedia(notasDisciplinas[2]); break;
            default: System.out.println("Digite um valor válido");;
        }

        System.out.println("Resultado da disciplina " + this.nomeDisciplinas[escolha] + ": " + resultado);

    }
    String mostrarResultado(double media){
        if(media < 7){
            return "Reprovado";
        }else{
            return "Aprovado";
        }
    }
    String calcularMedia(int[] vetor){
        double soma = 0;
        for(int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }
        return mostrarResultado(soma/vetor.length);
    }
}

