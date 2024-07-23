package co.jogador;

public abstract class Player {
    protected String nome;
    protected String cor;
    protected int posicao;
    protected int jogadas;

    public Player(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
        this.posicao = 0;
        this.jogadas = 0;
    }

    public abstract int rolarDados();

    public void mover(int casas) {
        this.posicao += casas;
    }

    public String getNome() { 
        return nome;
    }
    public String getCor() {
        return cor; 
    }
    public int getPosicao() { 
        return posicao; 
    }
    public int getJogadas() {
        return jogadas; 
    }
    public void incrementarJogadas() { 
        this.jogadas++; 
    }
}
