package com.loiane.cursojava.aula43.exercicio1;

public class ContaBancaria {
    private String nomeCliente;
    private int numConta;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Boolean confirmarSaldo(double temp){
        return temp >= 0;
    }
    public void sacarValor(double valor){
        double temp = this.saldo - valor;
        if(this.confirmarSaldo(temp) == true){
            this.saldo = temp;
        }else{
            System.out.println("Não foi possível realização de saque!");
        }
    }
    public void depositarDinheiro(double valor){
        this.saldo += valor;
    }
}
