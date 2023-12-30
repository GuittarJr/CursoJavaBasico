package com.loiane.cursojava.aula26;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + this.obterAutonomia() + "km" );
    }
    double obterAutonomia(){
        return capCombustivel * consumoCombustivel;
    }
    double calcularCombustivel(double km){
        return km/consumoCombustivel;
    }
}
