package co.jogador;
import co.jogo.Dados;

public class JogadorNormal extends Player {
    public JogadorNormal(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    public int rolarDados() {
        Dados dados = new Dados();
        return dados.rolar();
    }
}