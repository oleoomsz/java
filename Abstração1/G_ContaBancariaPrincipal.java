package abstracao;

public class G_ContaBancariaPrincipal {
    public static void main(String[] args) {
        G_ContaBancaria conta = new G_ContaBancaria();
        conta.titular = "Leonardo Manoel da Silva";
        conta.saldo = 500.00;

        conta.mostrarSaldo();
        conta.depositar(250.00);
        conta.mostrarSaldo();
        conta.sacar(100.00);
        conta.mostrarSaldo();
        conta.sacar(800.00); // Testando saque maior que o saldo
    }
}

