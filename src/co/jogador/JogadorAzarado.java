//jogador azarado, cuja soma dos valores dos dados é sempre menor ou igual a 6
package co.jogador;

public class JogadorAzarado extends Player {
    private int[] dadosAzarados;

    public JogadorAzarado(String cor, int[] valoresDosDados) {
        super(cor); // chama o construtor da classe pai Player
        setValoresDadosAzarados(valoresDosDados);
    }

    public void setValoresDadosAzarados(int[] valoresDosDados) {
        int soma = 0;
        for (int i = 0; i < valoresDosDados.length; i++) {
            soma += valoresDosDados[i];
        }
        if (soma <= 6) {
            this.dadosAzarados = valoresDosDados;
        } else {
            this.dadosAzarados = new int[]{1, 1, 1};
        }
    }


    public void info() {
        super.info();
        System.out.print("Dados do jogador azarado: ");
        for (int i = 0; i < dadosAzarados.length; i++) {
            System.out.print(dadosAzarados[i] + " ");
        }
        System.out.println();
    }
}
