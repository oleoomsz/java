package abstracao;

public class E_ProdutoPrincipal {
    public static void main(String[] args) {
        E_Produto p1 = new E_Produto();
        p1.nome = "Teclado Mecânico";
        p1.preco = 250.00;
        p1.estoque = 10;

        E_Produto p2 = new E_Produto();
        p2.nome = "Mouse Gamer";
        p2.preco = 120.50;
        p2.estoque = 5;

        p1.mostrarInformacoes();
        p1.vender(3);
        p1.mostrarInformacoes();

        System.out.println("--------------------");

        p2.mostrarInformacoes();
        p2.vender(7); // Vai testar o estoque insuficiente
        p2.mostrarInformacoes();
    }
}
