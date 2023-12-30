package com.loiane.cursojava.labs25.Exercicio2;

public class TesteClass {
    public static void main(String[] args) {
        ContaCorrente cliente = new ContaCorrente();
        cliente.numeroConta = 231;
        cliente.saldo = 0;
        cliente.statusEspecial = false;

        cliente.realizarSaque(50);
        cliente.realizarDeposito(100);
        double saldo = cliente.verificarSaldo();
        System.out.println(saldo);
        cliente.realizarSaque(100);
        saldo = cliente.verificarSaldo();
        System.out.println(saldo);
    }
}
