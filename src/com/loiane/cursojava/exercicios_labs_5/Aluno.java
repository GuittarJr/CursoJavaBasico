package com.loiane.cursojava.exercicios_labs_5;

public class Aluno {
    String name;
    int age;
    String[] hobbies;

    void apresentacao(){
        System.out.printf("Olá meu nome é %s, tenho %d anos de idade e gosto de %s e %s !",this.name,this.age,this.hobbies[0].toLowerCase(),this.hobbies[1].toLowerCase());
    }
}
