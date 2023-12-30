package com.loiane.cursojava.labs25.Exercicio2;

public class ContaCorrente {
    int numeroConta;
    double saldo;
    boolean statusEspecial;
    double limite = 5000;

    void realizarSaque(double saque){
        if (verificarSaque(saque) == true){
            this.saldo -= saque;
        }else{
            System.out.println("Você não tem saldo suficiente!");
        }
    }
    boolean verificarSaque(double saque){
        if (this.saldo > 0 && saque <= this.saldo){
            return true;
        }else {
            return false;
        }
    }

    void realizarDeposito(double deposito){
        double temp = this.saldo + deposito;
        if(temp > limite){
            System.out.println("Impossível a realização do deposito!");
        }else{
            System.out.println("Depósito realizado com sucesso!");
            this.saldo = temp;
        }
    }

    double verificarSaldo(){
        return this.saldo;
    }


}
