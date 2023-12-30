package com.loiane.cursojava.aula29;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros; // numero de passageiros;
    double capCombustivel; //capacidade de tanque de combustível;
    double consumoCombustivel; // consumo combustivel por km;

    Carro(){
        System.out.println("Classe carro foi instanciada!");
        numPassageiros = 4;
    }

    Carro(String marca, String modelo, int numPassageiros){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;

    }

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + this.obterAutonomia() + " km;");
    }

    double obterAutonomia(){
        return this.capCombustivel * this.consumoCombustivel;
    }

    double calcularCombustivel(double km){
        return km/consumoCombustivel;
    }

}
