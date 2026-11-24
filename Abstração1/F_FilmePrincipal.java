package abstracao;

public class F_FilmePrincipal {
    public static void main(String[] args) {
        F_Filme f1 = new F_Filme();
        f1.titulo = "Interestelar";
        f1.genero = "Ficção Científica";
        f1.duracao = 169;

        F_Filme f2 = new F_Filme();
        f2.titulo = "O Poderoso Chefão";
        f2.genero = "Drama";
        f2.duracao = 175;

        F_Filme f3 = new F_Filme();
        f3.titulo = "Toy Story";
        f3.genero = "Animação";
        f3.duracao = 81;

        f1.mostrarInformacoes();
        f1.assistir();

        System.out.println("--------------------");

        f2.mostrarInformacoes();
        f2.assistir();

        System.out.println("--------------------");

        f3.mostrarInformacoes();
        f3.assistir();
    }
}

