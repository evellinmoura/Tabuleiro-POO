import co.jogador.JogadorAzarado;

public class Main {
    public static void main(String[] args) {
        int[] valoresDosDados = {2, 4};
        JogadorAzarado jogadorA = new JogadorAzarado("verde", valoresDosDados);

        jogadorA.info();
    }
}
