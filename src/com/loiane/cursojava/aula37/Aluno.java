package com.loiane.cursojava.aula37;

public class Aluno extends Pessoa {
    private String curso;
    private double[] notas;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        int resultado = 0;
        for(int i = 0; i < notas.length; i++){
            resultado += notas[i];
        }
        return resultado/notas.length;
    }
}
