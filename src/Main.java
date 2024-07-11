
import co.jogador.JogadorAzarado;

public class Main {
    public static void main(String[] args) {
        int[] valoresDosDadosJogadorA = {2, 2, 2};
        JogadorAzarado jogadorAzaradoA = new JogadorAzarado("verde", valoresDosDadosJogadorA);

        jogadorAzaradoA.info();

        int[] valoresDosDadosJogadorB = {2, 1, 2,0};
        JogadorAzarado jogadorAzaradoB = new JogadorAzarado("vermelho", valoresDosDadosJogadorB);

        jogadorAzaradoB.info();

        int[] valoresDosDadosJogadorC = {2, 1, 5};
        JogadorAzarado jogadorAzaradoC = new JogadorAzarado("azul", valoresDosDadosJogadorC);

        jogadorAzaradoC.info();
    }
}
