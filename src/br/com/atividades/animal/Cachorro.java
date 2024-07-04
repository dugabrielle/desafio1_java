package br.com.atividades.animal;

public class Cachorro extends Animal {

    public Cachorro(String nome, String tamanho, String cor, String raca, int peso) {
        super(nome, tamanho, cor, raca, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    public void abanarRabo() {
        System.out.println(getNome() + " está abanando o rabo!");
        System.out.println(String.format("%s é um dog de %d kg da raça %s e sua cor é %s\n",
                getNome(), getPeso(), getRaca(), getCor()));
    }
}
