package co.jogador;

public class Player {
    // propriedades
    private String cor;
    private int posicao;

    // construtor
    public Player(String cor) {
        this.cor = cor;
        this.posicao = 0; // inicializando a posição como 0
    }


    public String getCor() {
        return this.cor;
    }

    public int getPosicao() {
        return this.posicao;
    }


    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    //metodo
    public void info() {
        System.out.println("Cor: " + this.cor);
        System.out.println("Posição: " + this.posicao);
    }
}
