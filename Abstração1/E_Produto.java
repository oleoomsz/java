package abstracao;

public class E_Produto {
    String nome;
    double preco;
    int estoque;

    public void vender(int quantidade) {
        if (estoque >= quantidade) {
            estoque -= quantidade;
            System.out.println("Venda de " + quantidade + "x " + nome + " realizada com sucesso!");
        } else {
            System.out.println("Estoque insuficiente!");
        }
    }

    public void mostrarInformacoes() {
        System.out.printf("Produto: %s | Preço: R$ %.2f | Estoque: %d unidades\n", nome, preco, estoque);
    }
}

