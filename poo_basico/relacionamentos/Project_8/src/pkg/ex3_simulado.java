package pkg;

import java.util.Scanner;

public class ex3_simulado {


    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a primeira nota: ");
        double nota1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = teclado.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = teclado.nextDouble();
        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);


        System.out.println("Média do aluno: " + aluno.calcularMedia());
        System.out.println("Aluno aprovado? " + aluno.aprovado());
        System.out.println("Maior nota: " + aluno.maiorNota());
        System.out.println("Menor nota: " + aluno.menorNota());

        teclado.close();
    }
}
