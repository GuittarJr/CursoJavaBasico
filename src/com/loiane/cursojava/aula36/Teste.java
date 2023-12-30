package com.loiane.cursojava.aula36;

public class Teste {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Luan Lucas");
        contato.setTelefone("34212212");

        Endereco end = new Endereco();
        end.setNomeRua("Rua das Ninfas");
        end.setNumero("102");
        end.setCidade("Recife");
        end.setCep("54321-102");
        end.setEstado("Pernambuco");
        end.setComplemento("Casa");

        contato.setEndereco(end);


    }
}
