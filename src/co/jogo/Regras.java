package co.jogo;
import java.util.Random;
import co.jogador.JogadorAzarado;
import co.jogador.JogadorNormal;
import co.jogador.JogadorSortudo;
import co.jogador.Player;
import java.util.List;

public class Regras {
    public void aplicarRegras(Player jogador, int novaPosicao) {

    }
    public void trocarComOutroJogador(Player jogador, List<Player> jogadores){
        System.out.println(jogador.getNome()+ "trocou de lugar com o jogador do ultimo lugar" );
        Player ultimo= jogadores.get(0);
        for (Player outroJogador : jogadores) {
            if (outroJogador.getPosicao() < ultimo.getPosicao()) {
                ultimo = outroJogador;  // atualiza ultimo para o jogador com a menor posição
            }
        }
        if (!ultimo.equals(jogador)) {
            int tempPosicao = jogador.getPosicao();
            jogador.setPosicao(ultimo.getPosicao());
            ultimo.setPosicao(tempPosicao);
            System.out.println(jogador.getNome() + " trocou de lugar com " + ultimo.getNome());
        }
    }
    public void escolherJogadorParaIncicio(Player jogador, List<Player> jogadores){
        System.out.println(jogador.getNome()+"escolha um jogador para ir para o incio");
        for(Player outroJogador:jogadores){// vai percorrer a lista de jogadores
            if(!outroJogador.equals(jogador)){
                outroJogador.setPosicao(0);
                System.out.println(outroJogador.getNome()+"esta no inicio");
                break;
            }

        }
    }
    public void casaSurpresa(Player jogador){
        System.out.println(jogador.getNome()+"caiu na casa surpresa");
        Random random= new Random();
        int sorte= random.nextInt(3);
        switch(sorte){
            case 0: jogador =new JogadorAzarado (jogador.getNome(), jogador.getCor());
                    System.out.println(jogador.getNome()+"virou o jogador azarado");
                    break;
            case 1: jogador =new JogadorAzarado (jogador.getNome(), jogador.getCor());
                jogador = new JogadorNormal(jogador.getNome(), jogador.getCor());
                System.out.println(jogador.getNome() + " virou Jogador Normal!");
                break;
            case 2:
                jogador = new JogadorSortudo(jogador.getNome(), jogador.getCor());
                System.out.println(jogador.getNome() + " virou Jogador Sortudo!");
                break;
            }
        }
        public void avancaTresCasas(Player jogador) {
            if (!(jogador instanceof JogadorAzarado)) {
                jogador.mover(3);
                System.out.println(jogador.getNome() + " avançou 3 casas.");
            }
        }
    }

