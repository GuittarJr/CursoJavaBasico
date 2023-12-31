package com.loiane.cursojava.aula43.exercicio1;

import java.util.Scanner;

public class ContaEspecial extends ContaBancaria{
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean verificarLimite(double temp){
        return (this.limite - temp) >= 0;
    }

    @Override
    public double getDiaRendimento() {
        return 0;
    }

    public void sacarValor(double valor){
        double temp = this.getSaldo() - valor;
        if(this.confirmarSaldo(temp) == true){
            this.setSaldo(temp);
        } else if (this.verificarLimite(temp) == true) {
            this.setSaldo(0);
            limite -= temp;
        }else{
            System.out.println("Não foi possível realizar saque");
        }
    }

    @Override
    public String toString() {
        String s = "Nome: " + this.getNomeCliente() + ";\nSaldo: " + this.getSaldo();
        return "ContaEspecial{" + s +
                "limite=" + limite +
                '}';
    }

}
