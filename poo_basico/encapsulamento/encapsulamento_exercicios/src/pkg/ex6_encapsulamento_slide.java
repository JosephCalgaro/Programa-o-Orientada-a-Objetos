package pkg;

import java.util.Scanner;

public class ex6_encapsulamento_slide {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o nome da pessoa: ");
        String nome = teclado.nextLine();
        System.out.println("Informe a idade da pessoa: ");
        int idade = teclado.nextInt();
        System.out.println("Informe o cpf da pessoa: ");
        int cpf = teclado.nextInt();

        Pessoa p = new Pessoa(nome, idade, cpf);

        p.verificaMaiorIdade();
    }
}
