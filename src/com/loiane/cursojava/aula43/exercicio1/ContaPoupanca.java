package com.loiane.cursojava.aula43.exercicio1;

public class ContaPoupanca extends ContaBancaria{
    private double diaRendimento;

    public ContaPoupanca(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(){
        double temp = this.getSaldo() + diaRendimento;
        this.setSaldo(temp);
    }
}
