package pkg;

import java.util.Scanner;

public class ex1_encapsulamento_slide {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o saldo inicial:");
        double saldo = teclado.nextDouble();

        System.out.println("Digite o limite:");
        double limite = teclado.nextDouble();

        ContaBancaria conta = new ContaBancaria(saldo, limite);

        System.out.println("Digite o valor que deseja sacar: ");
        double saque = teclado.nextDouble();

        if (conta.saque(saque)){
            System.out.println("Saque realizado com sucesso!");
        }

        System.out.println("Valor atual da conta bancaria: " + saldo);
        teclado.close();


    }
}
