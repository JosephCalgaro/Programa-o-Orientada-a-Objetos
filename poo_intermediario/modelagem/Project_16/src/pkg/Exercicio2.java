package pkg;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Ana", 8.0, 7.5));
        alunos.add(new Aluno("Bruno", 4.5, 5.0));
        alunos.add(new Aluno("Carla", 6.0, 6.5));
        alunos.add(new Aluno("Diego", 3.0, 4.0));
        alunos.add(new Aluno("Eduarda", 9.0, 8.5));

        System.out.println("=== Resultado dos Alunos ===");
        for (Aluno a : alunos) {
            double media = a.calcularMedia();
            System.out.printf("Aluno: %-10s | Média: %.1f | Situação: %s%n",
                a.getNome(),
                media,
                media >= 6 ? "APROVADO" : "REPROVADO"
            );
        }
    }
}
