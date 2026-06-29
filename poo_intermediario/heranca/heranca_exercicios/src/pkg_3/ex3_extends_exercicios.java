package pkg_3;

import java.util.Scanner;

public class ex3_extends_exercicios {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        String nome = ler.nextLine();

        System.out.print("Informe a idade: ");
        int idade = ler.nextInt();
        ler.nextLine();

        System.out.print("Informe o tipo: ");
        String tipo = ler.nextLine();

        Pessoa p = new Pessoa(nome, idade, tipo);

        System.out.println("\n--- Dados ---");
        System.out.println("Nome: " + p.nome);
        System.out.println("Idade: " + p.idade);
        System.out.println("Tipo: " + p.tipo);

        p.falar();
        p.andar();

        ler.close();
    }
}
