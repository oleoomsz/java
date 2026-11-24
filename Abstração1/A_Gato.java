package abstracao;

public class A_Gato {
    String nome;
    String raca;
    int idade;

    public void miar() {
        System.out.println("Miau!");
    }

    public void comer() {
        System.out.println(nome + ", está comendo");
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + " | Raça: " + raca + " | Idade: " + idade + " anos");
    }
}