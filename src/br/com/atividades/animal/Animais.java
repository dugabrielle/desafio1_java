package br.com.atividades.animal;

public class Animais {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Huan", "grande", "preto e marrom", "Pastor alemão", 32);
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato("Gris", "pequeno", "cinza", "Azul Russo", 4);
        gato.emitirSom();
        gato.arranharMoveis();
    }
}
