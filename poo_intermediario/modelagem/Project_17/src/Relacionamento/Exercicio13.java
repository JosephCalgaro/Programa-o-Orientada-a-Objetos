package Relacionamento;

import java.util.ArrayList;

public class Exercicio13 {
    // método que retorna a conta com maior saldo
    public static Conta maiorSaldo(
            ArrayList<Conta> contas) {

        Conta maior = contas.get(0);

        for (Conta c : contas) {

            if (c.getSaldo() > maior.getSaldo()) {

                maior = c;
            }
        }

        return maior;
    }

    public static void main(String[] args) {

        ArrayList<Conta> contas = new ArrayList<>();

        contas.add(new Conta(1, "Joseph", 2500));

        contas.add(new Conta(2, "Maria", 7800));

        contas.add(new Conta(3, "Carlos", 4300));

        Conta contaMaior =
                maiorSaldo(contas);

        System.out.println(
                "Conta com maior saldo:"
        );

        System.out.println("----------------");

        System.out.println(contaMaior);
    }
}

