package br.com.desafio.pessoa;

public class Inicial {

    public static void main(String[] args) {
        idadePessoa pessoa = new idadePessoa();

        pessoa.setNome("Gabrielle");
        pessoa.setIdade(24);

        pessoa.verificarIdade();

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

    }
}

