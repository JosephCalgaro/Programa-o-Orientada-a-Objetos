package exercicios;

public class ContaInvestimento extends Conta{

    public ContaInvestimento(double saldo, double limite) {
        super(saldo, limite);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado na Conta Investimento. Saldo: R$ " + saldo);
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado na Conta Investimento. Saldo: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
}
