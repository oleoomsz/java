package abstracao;

public class D_MusicaPrincipal {
    public static void main(String[] args) {
        D_Musica m1 = new D_Musica();
        m1.titulo = "Bohemian Rhapsody";
        m1.artista = "Queen";
        m1.duracao = 5.55;

        D_Musica m2 = new D_Musica();
        m2.titulo = "Tempo Perdido";
        m2.artista = "Legião Urbana";
        m2.duracao = 5.02;

        D_Musica m3 = new D_Musica();
        m3.titulo = "Blinding Lights";
        m3.artista = "The Weeknd";
        m3.duracao = 3.20;

        m1.mostrarDetalhes();
        m1.tocar();
        m1.pausar();

        System.out.println("--------------------");

        m2.mostrarDetalhes();
        m2.tocar();
        m2.pausar();

        System.out.println("--------------------");

        m3.mostrarDetalhes();
        m3.tocar();
        m3.pausar();
    }
}