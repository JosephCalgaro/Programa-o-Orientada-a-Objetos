package pkg;

public class ContaBancaria {
    private double saldo;
    private double limite;

    // Construtor
    public ContaBancaria(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    // GET e SET
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo não pode ser negativo.");
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if (limite >= 0) {
            this.limite = limite;
        } else {
            System.out.println("Limite não pode ser negativo.");
        }
    }

    public boolean saque(double valor) {
        if (valor > limite) {
            System.out.println("Saque ultrapassa o limite permitido!");
            return false;
        }

        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            return false;
        }

        saldo -= valor;
        return true;
    }
}