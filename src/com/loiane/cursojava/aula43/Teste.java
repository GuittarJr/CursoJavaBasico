package com.loiane.cursojava.aula43;

public class Teste {
    public static void main(String[] args) {

        Pokemon charmander = new Pokemon();

        String[] charmanderTipo = {"Fogo","Voador"};
        charmander.setNome("Charmander");
        charmander.setLevel(10);
        charmander.setNumPokedex(4);
        charmander.setTipo(charmanderTipo);

        System.out.println(charmander);

        Pokemon charmander2 = new Pokemon();
        String[] charmanderTipo2 = {"Fogo","Voador"};
        charmander2.setNome("Charmander");
        charmander2.setLevel(10);
        charmander2.setNumPokedex(4);
        charmander2.setTipo(charmanderTipo);

        System.out.println(charmander.equals(charmander2));

    }

}
