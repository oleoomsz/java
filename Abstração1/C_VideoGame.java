package abstracao;

public class C_VideoGame {
    String marca;
    String modelo;
    boolean ligado;

    public void ligar() {
        ligado = true;
        System.out.println("O console está ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("O console foi desligado.");
    }

    public void verificarStatus() {
        if (ligado) {
            System.out.println("Status (" + marca + " " + modelo + "): Ligado");
        } else {
            System.out.println("Status (" + marca + " " + modelo + "): Desligado");
        }
    }
}
