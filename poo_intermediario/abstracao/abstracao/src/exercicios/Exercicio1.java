package exercicios;

public class Exercicio1 {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(1000, 500);
        cc.depositar(200);
        cc.sacar(1500);

        ContaInvestimento ci = new ContaInvestimento(5000, 0);
        ci.depositar(1000);
        ci.sacar(3000);
    }
}
