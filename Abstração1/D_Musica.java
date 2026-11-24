package abstracao;

public class D_Musica {
    String titulo;
    String artista;
    double duracao; // em minutos

    public void tocar() {
        System.out.println("Tocando " + titulo + " de " + artista + "...");
    }

    public void pausar() {
        System.out.println("Música pausada");
    }

    public void mostrarDetalhes() {
        System.out.println("Título: " + titulo + " | Artista: " + artista + " | Duração: " + duracao + " min");
    }
}
