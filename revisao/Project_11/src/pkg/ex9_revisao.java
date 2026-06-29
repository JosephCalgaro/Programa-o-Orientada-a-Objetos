package pkg;

import java.util.Scanner;

public class ex9_revisao {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe os dados do filme: ");
        System.out.println("Titulo: ");
        String titulo = teclado.nextLine();
        System.out.println("Diretor: ");
        String diretor = teclado.nextLine();
        System.out.println("Duração em minutos: ");
        int duracaoEmMinutos = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Genero: ");
        String genero = teclado.nextLine();

        Filme filme1 = new Filme(titulo, diretor, duracaoEmMinutos, genero);

        filme1.ehLongo();
        filme1.exibirDetalhes();

    }

}
