package co.jogador;

public abstract class Player {
    //atributos
    protected String nome;
    protected String cor;
    protected int posicao;
    protected boolean pulaARodada;
    protected int jogadas;


    // construtor
    public Player(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
        this.posicao = 0;
        this.jogadas = 0;
        this.pulaARodada= false;
    }

    public abstract int rolarDados();
//metodo pra mover o jogador
    public void mover(int casas) {
        this.posicao += casas;
    }

// get e stters
    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public int getPosicao() {
        return posicao;
    }
    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public int getJogadas() {
        return jogadas;
    }

    public void incrementarJogadas() {
        this.jogadas++;
    }

    public boolean isPulaARodada() {
        return pulaARodada;
    }

    public void setPulaARodada(boolean pulaARodada) {
        this.pulaARodada = pulaARodada;
    }

}
