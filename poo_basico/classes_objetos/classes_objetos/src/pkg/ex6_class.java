package pkg;

import java.util.Scanner;

public class ex6_class {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        aluno aluno1 = new aluno();

        System.out.println("Digite o nome do aluno:");
        aluno1.nome = teclado.nextLine();

        System.out.println("Digite a matrícula:");
        aluno1.matricula = teclado.nextLine();

        System.out.println("Digite a primeira nota:");
        aluno1.nota1 = teclado.nextDouble();

        System.out.println("Digite a segunda nota:");
        aluno1.nota2 = teclado.nextDouble();

        System.out.println("Digite a terceira nota:");
        aluno1.nota3 = teclado.nextDouble();

        double media = (aluno1.nota1 + aluno1.nota2 + aluno1.nota3) / 3;

        System.out.println("\n--- Dados do Aluno ---");
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Matrícula: " + aluno1.matricula);
        System.out.println("Média: " + media);

        if (media >= 6) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
        
        teclado.close();

    }
}