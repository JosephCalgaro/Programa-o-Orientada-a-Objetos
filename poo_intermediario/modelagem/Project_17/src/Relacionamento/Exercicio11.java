package Relacionamento;

import java.util.ArrayList;

public class Exercicio11 {

    // método que conta mulheres
    public static int contarMulheres(
            ArrayList<Pessoa> pessoas) {

        int quantidade = 0;

        for (Pessoa p : pessoas) {

            if (p.getSexo().equalsIgnoreCase("Feminino")) {

                quantidade++;
            }
        }

        return quantidade;
    }

    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Maria", 22, "Feminino"));

        pessoas.add(new Pessoa("João", 30, "Masculino"));

        pessoas.add(new Pessoa("Ana", 19, "Feminino"));

        pessoas.add(new Pessoa("Carlos", 25, "Masculino"));

        int totalMulheres = contarMulheres(pessoas);

        System.out.println("Quantidade de mulheres: " + totalMulheres);
    }
}
