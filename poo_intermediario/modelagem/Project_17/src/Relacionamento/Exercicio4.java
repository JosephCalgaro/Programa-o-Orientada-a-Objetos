package Relacionamento;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria("João Silva", 1000.00);
        conta.mostrarSaldo();
        conta.depositar(500.00);
        conta.mostrarSaldo();
        Cheque cheque = new Cheque(250.00);
        conta.depositar(cheque);
        conta.mostrarSaldo();
    }
}
