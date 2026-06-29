package pkg;

import java.util.Scanner;

public class ex4_metodos {
    
    public static void main(String[] args) {
        contaCorrente c = new contaCorrente();
        Scanner teclado = new Scanner(System.in);

        // Saldo inicial
        System.out.println("Digite o saldo inicial:");
        float saldoInicial = teclado.nextFloat();
        c.definirSaldoInicial(saldoInicial);
        c.exibirSaldo();

        // Saque
        System.out.println("\nDigite o valor a ser sacado:");
        float valorSaque = teclado.nextFloat();

        if (c.sacarSaldo(valorSaque)) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
        c.exibirSaldo();

        // Depósito
        System.out.println("\nDigite o valor a ser depositado:");
        float valorDeposito = teclado.nextFloat();
        c.depositarSaldo(valorDeposito);
        c.exibirSaldo();

        // Segundo saque
        System.out.println("\nDigite o valor a ser sacado:");
        valorSaque = teclado.nextFloat(); // reutiliza variável

        if (c.sacarSaldo(valorSaque)) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
        c.exibirSaldo();

        teclado.close();
    }
}
