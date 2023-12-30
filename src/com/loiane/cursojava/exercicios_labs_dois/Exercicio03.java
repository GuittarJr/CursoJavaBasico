
package com.loiane.cursojava.exercicios_labs_dois;

import java.util.Scanner;

/**
 *
 * @author Geovane
 * App verifica se numero digitado e F e M;
 */
public class Exercicio03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite \"F\" para feminino ou \"M\" para masculino: " );
        String letra = scan.next();
        
        switch(letra){
            case "F": System.out.println("Feminino"); break;
            case "M": System.out.println("Masculino");break;
            default: System.out.println("Digite um valor válido");
        }
    }
}
