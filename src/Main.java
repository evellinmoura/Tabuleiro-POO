import co.jogador.Player;

public class Main {
    public static void main(String[] args) {
        Player jogador = new Player("verde", "azarado");

        jogador.setPosicao(2);
        jogador.info();
    }
}
