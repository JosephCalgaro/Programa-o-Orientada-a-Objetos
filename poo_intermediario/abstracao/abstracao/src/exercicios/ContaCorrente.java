package exercicios;

public class ContaCorrente extends Conta{


    public ContaCorrente(double saldo, double limite) {
        super(saldo, limite);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito realizado na Conta Corrente. Saldo: R$ " + saldo);
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado na Conta Corrente. Saldo: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
