package Relacionamento;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Funcionario f1 = new Funcionario("Maria", "Analista de Sistemas", 5000.00);
        Gerente g1 = new Gerente("João", "Gerente de Projetos", 10000.00, 20); //bonus é calculado em porcentagem
        f1.calcularSalario();
        g1.calcularSalario();
    }
}
