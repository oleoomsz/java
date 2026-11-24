package abstracao;

public class F_Filme {
    String titulo;
    String genero;
    int duracao; // em minutos

    public void assistir() {
        System.out.println("Assistindo " + titulo + "...");
    }

    public void mostrarInformacoes() {
        System.out.println("Filme: " + titulo + " | Gênero: " + genero + " | Duração: " + duracao + " min");
    }
}
