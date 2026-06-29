package Relacionamento;

import java.util.ArrayList;

public class Exercicio10 {

    public static void main(String[] args) {

        ArrayList<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Joseph", 8, 7));

        alunos.add(new Aluno("Maria", 5, 4));

        alunos.add(new Aluno("Carlos", 9, 10));

        // percorrendo lista
        for (Aluno a : alunos) {

            double media = a.calcularMedia();

            System.out.println("----------------");

            System.out.println("Aluno: " + a.getNome());

            System.out.println("Média: " + media);

            if (media >= 6) {

                System.out.println("Aprovado");

            } else {

                System.out.println("Reprovado");
            }
        }
    }
}
