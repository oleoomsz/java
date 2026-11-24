package abstracao;

public class B_pizza {
    String sabor;
    String tamanho;
    boolean bordaRecheada;

    public void preparar() {
        System.out.println("Preparando pizza de " + sabor + "...");
    }

    public void assando() {
        System.out.println("Assando pizza tamanho " + tamanho + "...");
    }

    public void mostrarInformacoes() {
        String borda = bordaRecheada ? "Sim" : "Não";
        System.out.println("Sabor: " + sabor + " | Tamanho: " + tamanho + " | Borda Recheada: " + borda);
    }
}