package pkg;

import java.util.Scanner;

public class ex1_metodos {

    public static void main(String[] args)
{
    Scanner teclado = new Scanner(System.in);
    disciplinaAluno a = new disciplinaAluno();

    //a) valores originais
    System.out.println("Valores originais:");
    a.alunoInfo();

    //b) entrada do usuario
    System.out.println("\nDigite os dados do aluno:");
    String nome = teclado.nextLine();

    System.out.println("Digite a carga horária: ");
    int cargaHoraria = teclado.nextInt();
    teclado.nextLine(); // Limpar o buffer do teclado

    System.out.println("Digite o nome do professor: ");
    String nomeProfessor = teclado.nextLine();

    a.inserirDados(nome, cargaHoraria, nomeProfessor);

    // c) exibir as informações atualizadas
    System.out.println("\nInformações atualizadas:");
    a.alunoInfo();

    teclado.close();
}
    
}
