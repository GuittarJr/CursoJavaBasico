package com.loiane.cursojava.aula34.labs.exercicio03;

public class ConversaoDeUnidadesDeArea {
    public static double emPesQuadrado(double num){
        return num * 10.764;
    }

    public static double emCentimetrosQuadrado(double cent){
        return cent * Math.pow(30.48,2);
    }

    public static int milhasQuadradaEmAcres(int milhas){return (milhas * 640);}

    public static double acresEmPesQuadrado(double acre){return (acre * 43.560);};

}
