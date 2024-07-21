package co.jogo;

public class Dados {
    public int rolar() {
        int dado1 = (int) (Math.random() * 6) + 1;
        int dado2 = (int) (Math.random() * 6) + 1;
        return dado1 + dado2;
    }
}