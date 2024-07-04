package br.com.atividades.animal;

public class Animal {

    private String nome;
    private  String tamanho;
    private String cor;
    private  String raca;
    private  int peso;


    public Animal(String nome, String tamanho, String cor, String raca, int peso) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.cor = cor;
        this.raca = raca;
        this.peso = peso;
    }

    public void emitirSom() {
        System.out.println("Animal emitindo som");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }




}
