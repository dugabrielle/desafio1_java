package br.com.desafio2.pessoa;

public class Principal {

    public static void main(String[] args) {
        idadePessoa pessoa = new idadePessoa();

        pessoa.setNome("Gabrielle");
        pessoa.setIdade(24);

        pessoa.verificarIdade();

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

    }
}

