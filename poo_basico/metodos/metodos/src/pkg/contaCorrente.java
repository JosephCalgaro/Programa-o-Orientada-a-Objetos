package pkg;

public class contaCorrente {
    float saldo;

    public void definirSaldoInicial(float saldo){
        this.saldo = saldo;
    }

    public boolean depositarSaldo(float valor){
        if(valor > 0){
            saldo += valor;
            return true;
        } else {

            return false;
        }
    }

    public boolean sacarSaldo(float valor){
        if(saldo >= valor){
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public void exibirSaldo(){
        System.out.println("Saldo atual: R$" + saldo);
    }
}
