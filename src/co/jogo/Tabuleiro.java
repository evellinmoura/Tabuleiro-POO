package co.jogo;

import co.jogador.Player;
import java.util.List;

public class Tabuleiro {
    private Regras regras;
    private int[] casas;

    public Tabuleiro() {
        casas = new int[40];
        regras = new Regras();
    }

    public void moverJogador(Player jogador, List<Player> jogadores, int casas) {
        jogador.mover(casas);
        aplicarRegras(jogador, jogadores);
    }

    private void aplicarRegras(Player jogador, List<Player> jogadores) {
        int posicao = jogador.getPosicao();

        if (posicao == 10 || posicao == 25 || posicao == 38) {
            System.out.println(jogador.getNome() + " não joga na próxima rodada.");
           // regras.pularProximaRodada(jogador);
        }

        if (posicao == 13) {
            System.out.println(jogador.getNome() + " caiu na casa surpresa!");
            regras.casaSurpresa(jogador);
        }

        if (posicao == 5 || posicao == 15 || posicao == 30) {
            regras.avancaTresCasas(jogador);
        }

        if (posicao == 17 || posicao == 27) {
            System.out.println(jogador.getNome() + " escolha um competidor para voltar ao início.");
            regras.escolherJogadorParaIncicio(jogador, jogadores);
        }

        if (posicao == 20 || posicao == 35) {
            System.out.println(jogador.getNome() + " trocou de lugar com o jogador que está mais atrás.");
            regras.trocarComOutroJogador(jogador, jogadores);
        }
    }

    public void mostrarTabuleiro(List<Player> jogadores) {
        for (Player jogador : jogadores) {
            System.out.println(jogador.getNome() + " (" + jogador.getCor() + ") está na casa " + jogador.getPosicao());
        }
    }
}
