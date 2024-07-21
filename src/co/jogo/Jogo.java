package co.jogo;

import co.jogador.JogadorAzarado;
import co.jogador.JogadorNormal;
import co.jogador.JogadorSortudo;
import co.jogador.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogo {
    private Tabuleiro tabuleiro;
    private List<Player> jogadores;

    public Jogo() {
        tabuleiro = new Tabuleiro();
        jogadores = new ArrayList<>();
    }

    public void adicionarJogador(Player jogador) {
        jogadores.add(jogador);
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            for (Player jogador : jogadores) {
                System.out.println("Vez de " + jogador.getNome() + " (" + jogador.getCor() + ")");
                System.out.println("Pressione Enter para rolar os dados...");
                scanner.nextLine();

                int movimento = jogador.rolarDados();
                jogador.incrementarJogadas();
                System.out.println("Resultado dos dados: " + movimento);

                tabuleiro.moverJogador(jogador, movimento);
                tabuleiro.mostrarTabuleiro(jogadores);

                if (jogador.getPosicao() >= 40) {
                    System.out.println(jogador.getNome() + " venceu o jogo!");
                    mostrarEstatisticas();
                    return;
                }
            }
        }
    }

    private void mostrarEstatisticas() {
        System.out.println("Estatísticas Finais:");
        for (Player jogador : jogadores) {
            System.out.println(jogador.getNome() + " (" + jogador.getCor() + ") - Jogadas: " + jogador.getJogadas() + ", Posição Final: " + jogador.getPosicao());
        }
    }

    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        jogo.adicionarJogador(new JogadorAzarado("Jogador Azarado", "Vermelho"));
        jogo.adicionarJogador(new JogadorNormal("Jogador Normal", "Verde"));
        jogo.adicionarJogador(new JogadorSortudo("Jogador Sortudo", "Azul"));
        jogo.iniciar();
    }
}
