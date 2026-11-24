package abstracao;

public class G_ContaBancaria {
    String titular;
    double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado.\n", valor);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado.\n", valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }

    public void mostrarSaldo() {
        System.out.printf("Titular: %s | Saldo atual: R$ %.2f\n", titular, saldo);
    }
}
