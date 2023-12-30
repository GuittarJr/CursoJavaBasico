package com.loiane.cursojava.aula33.labs.exercicio2;

import java.util.Scanner;

class ContaCorrente {
    Scanner scan = new Scanner(System.in);
    private int numero;
    private double saldo;
    private boolean contaEspecial;
    private double limite;

    public ContaCorrente(int numero, boolean contaEspecial) {
        this.numero = numero;
        this.saldo = 0;
        this.contaEspecial = contaEspecial;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isContaEspecial() {
        return contaEspecial;
    }

    public void setContaEspecial(boolean contaEspecial) {
        this.contaEspecial = contaEspecial;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void depositarDinheiro(){
        double temp;
        System.out.println("Digite o valor que deseja depositar:");
        temp = scan.nextDouble();
        fazerDeposito(temp);
    }

    private boolean verificarSaldo(double valor){
       double temp = this.getSaldo() - valor;
       return(temp > 0);
    }

    private boolean temCredito(double valor){
        double temp = this.getLimite() + valor;
        return (isContaEspecial() && temp >= 0 );
    }

    public void sacarDinheiro(double valor){
        if(this.verificarSaldo(valor)){
            System.out.println("Você sacou: R$:" + valor);
            this.setSaldo(this.saldo -= valor);
        } else if(temCredito(this.getSaldo() - valor)){
            System.out.println("Você sacou utilizando crédito especial: R$: " + valor);
            double limite = this.getLimite() + (this.getSaldo() - valor);
            this.setSaldo(0);
            this.setLimite(limite);
        }else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void fazerDeposito(double valor){
        this.setSaldo(this.getSaldo() + valor);
    }

    public void obterLimite(){
        if(this.isContaEspecial()){
            setLimite(5000);
        }else{
            setLimite(0);
        }
    }



}
