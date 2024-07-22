package co.jogo;

import co.jogador.JogadorAzarado;
import co.jogador.Player;
import java.util.List;

public class Tabuleiro {
    private int[] casas;

    public Tabuleiro() {
        casas = new int[40];
        // Inicialização das casas
    }

    public void moverJogador(Player jogador, int casas) {
        jogador.mover(casas);
        aplicarRegras(jogador);
    }

    private void aplicarRegras(Player jogador) {
        int posicao = jogador.getPosicao();

        if (posicao == 10 || posicao == 25 || posicao == 38) {
            System.out.println(jogador.getNome() + " não joga na próxima rodada.");
            // lógica pra pular a próxima rodada
        }

        if (posicao == 13) {
            System.out.println(jogador.getNome() + " caiu na casa surpresa!");
            // lógica pra tirar uma carta e mudar o tipo do jogador
        }

        if (posicao == 5 || posicao == 15 || posicao == 30) {
            if (!(jogador instanceof JogadorAzarado)) {
                System.out.println(jogador.getNome() + " avançou 3 casas.");
                jogador.mover(3);
            }
        }

        if (posicao == 17 || posicao == 27) {
            System.out.println(jogador.getNome() + " pode escolher um competidor para voltar ao início.");
            // lógica pra escolher um jogador para o início
        }

        if (posicao == 20 || posicao == 35) {
            System.out.println(jogador.getNome() + " trocou de lugar com o jogador que está mais atrás.");
            // lógica que troca de lugar com o jogador que está mais atrás
        }
    }

    public void mostrarTabuleiro(List<Player> jogadores) {
        for (Player jogador : jogadores) {
            System.out.println(jogador.getNome() + " (" + jogador.getCor() + ") está na casa " + jogador.getPosicao());
        }
    }
}
