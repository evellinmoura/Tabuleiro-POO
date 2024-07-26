package co.jogador;

import co.jogo.Dados;

public class JogadorAzarado extends Player  {
    public JogadorAzarado(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    public int rolarDados() {
        Dados dados = new Dados();
        int resultado = dados.rolar();
        if (resultado <= 7) {
            return resultado;
        } else {
            return 6;
        }
    }
}
