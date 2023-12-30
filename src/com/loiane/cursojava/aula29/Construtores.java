package com.loiane.cursojava.aula29;

public class Construtores {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Fiat";
        carro.modelo = "Ducato";
        carro.capCombustivel = 100;
        carro.consumoCombustivel = 0.2;

        System.out.println(carro.numPassageiros);

        Carro van = new Carro("Fiat","Ducato", 4);
        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.numPassageiros);

        Carro2 carro2 = new Carro2("Fiat","Ducato", 4,98,0.2);

    }
}
