package pkg;

import java.util.ArrayList;
import java.util.List;

public class Exercicio5 {

    public static Conta contaComMaiorSaldo(List<Conta> contas) {
        Conta maior = contas.get(0);
        for (Conta c : contas) {
            if (c.getSaldo() > maior.getSaldo()) {
                maior = c;
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();

        contas.add(new Conta(1001, "Ana Lima", 1500.00));
        contas.add(new Conta(1002, "Bruno Souza", 8750.50));
        contas.add(new Conta(1003, "Carla Mendes", 320.75));
        contas.add(new Conta(1004, "Diego Rocha", 5100.00));
        contas.add(new Conta(1005, "Eduarda Costa", 12400.99));

        System.out.println("=== Lista de Contas ===");
        for (Conta c : contas) {
            System.out.println(c);
        }

        Conta maior = contaComMaiorSaldo(contas);
        System.out.println("\n=== Conta com Maior Saldo ===");
        System.out.println(maior);
    }
}
