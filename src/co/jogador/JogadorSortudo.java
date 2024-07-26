package co.jogador;
import co.jogo.Dados;


public class JogadorSortudo extends Player {
    public JogadorSortudo(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    public int rolarDados() {
        Dados dados = new Dados();
        int resultado = dados.rolar();
        if (resultado >= 6) {
            return resultado;
        } else {
            return 7;
        }
    }
}
