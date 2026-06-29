package Relacionamento;

public class ContaBancaria {
    protected String nomeTitular;
    protected double valorT;

    public ContaBancaria(String nomeTitular, double valorT) {
        this.nomeTitular = nomeTitular;
        this.valorT = valorT;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getValorT() {
        return valorT;
    }

    public void setValorT(double valorT) {
        this.valorT = valorT;
    }

    // depósito normal
    public void depositar(double valor) {
        System.out.println("Depósito: R$ " + valor);
        this.valorT = this.valorT + valor;
    }

    // sobrecarga usando cheque
    public void depositar(Cheque cheque) {
        valorT += cheque.getValor();
        System.out.println("Depósito em cheque: R$ " + cheque.getValor());
    }

    public void mostrarSaldo() {
        System.out.println("Saldo atual: R$ " + valorT);
    }
}
