package abstracao;

public class B_pizzaPrincipal {

	public static void main(String[] args) {
        B_pizza pizza1 = new B_pizza();
        pizza1.sabor = "Calabresa";
        pizza1.tamanho = "Grande";
        pizza1.bordaRecheada = true;

        B_pizza pizza2 = new B_pizza();
        pizza2.sabor = "Margherita";
        pizza2.tamanho = "Média";
        pizza2.bordaRecheada = false;

        pizza1.preparar();
        pizza1.assando();
        pizza1.mostrarInformacoes();

        System.out.println("--------------------");

        pizza2.preparar();
        pizza2.assando();
        pizza2.mostrarInformacoes();
    }
}