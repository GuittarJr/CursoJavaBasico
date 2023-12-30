package com.loiane.cursojava.aula33.labs.exercicio1;

class Lampada {
    //Atributos:
    private String marca;
    private String modelo;
    private String cor;
    private int potencia;
    private boolean ligado;

    // Constructors:
    public Lampada(String marca, String modelo, String cor, int potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.potencia = potencia;
        this.ligado = false;
    }

    //Getter and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    // Methods

    public void mostrarInfo(){
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Potência: " + this.getPotencia());
        System.out.println("Status: " + this.statusLampada());
    }

    private void ligarLampada(){
        this.setLigado(true);
    }

    private void desligaLampada(){
        this.setLigado(false);
    }
    public void mudarEstado(){
        if(isLigado()){
            this.desligaLampada();
        }else{
            this.ligarLampada();
        }
    }

    public String statusLampada(){
        return this.isLigado() ? "Ligada" : "Desligada";
    }
}
