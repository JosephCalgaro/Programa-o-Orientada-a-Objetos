package pkg;

import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {

    public static int contarMulheres(List<Pessoa> pessoas) {
        int count = 0;
        for (Pessoa p : pessoas) {
            if (p.getSexo().equalsIgnoreCase("F")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Alice", 28, "F"));
        pessoas.add(new Pessoa("Roberto", 35, "M"));
        pessoas.add(new Pessoa("Fernanda", 22, "F"));
        pessoas.add(new Pessoa("Carlos", 40, "M"));
        pessoas.add(new Pessoa("Juliana", 31, "F"));
        pessoas.add(new Pessoa("Marcos", 25, "M"));

        System.out.println("=== Lista de Pessoas ===");
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }

        int totalMulheres = contarMulheres(pessoas);
        System.out.println("\nQuantidade de mulheres: " + totalMulheres);
    }
}
