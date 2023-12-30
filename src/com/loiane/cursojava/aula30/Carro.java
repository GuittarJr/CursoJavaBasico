package com.loiane.cursojava.aula30;
    public class Carro {
        String marca;
        String modelo;
        int numPassageiros; // numero de passageiros;
        double capCombustivel; //capacidade de tanque de combustível;
        double consumoCombustivel; // consumo combustivel por km;

        public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
            this.marca = marca;
            this.modelo = modelo;
            this.numPassageiros = numPassageiros;
            this.capCombustivel = capCombustivel;
            this.consumoCombustivel = consumoCombustivel;
        }

        public Carro() {
        }

        public Carro(String marca, String modelo) {
           this(marca,modelo, 10);
            System.out.println("Chamando construtor com 2 parametros");
        }

        public Carro(String marca, String modelo, int numPassageiros) {
            this.marca = marca;
            this.modelo = modelo;
            this.numPassageiros = numPassageiros;

            System.out.println("Chamando construtor com 3 paramentros");
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


