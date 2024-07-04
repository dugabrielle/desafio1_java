package br.com.atividades.animal;

public class Gato extends Animal {

    public Gato(String nome, String tamanho, String raca, String cor, int peso) {
        super(nome, tamanho, raca, cor, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    public void arranharMoveis() {
        System.out.println(getNome() + " está arranhando móveis");
        System.out.println(String.format("%s é um gatinho de %d kg da raça %s e sua cor é %s",
                getNome(), getPeso(), getRaca(), getCor()));
    }
}
