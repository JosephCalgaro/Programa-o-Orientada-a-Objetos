package pkg;

import java.util.Scanner;

public class ex3_metodos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        pessoa p1 = new pessoa();
        pessoa p2 = new pessoa();

        // Pessoa 1
        System.out.println("=== Pessoa 1 ===");

        System.out.print("Nome: ");
        String nome1 = teclado.nextLine();

        System.out.print("Data de nascimento: ");
        String data1 = teclado.nextLine();

        System.out.print("Email: ");
        String email1 = teclado.nextLine();

        System.out.print("Endereço: ");
        String end1 = teclado.nextLine();

        p1.inserirDadosPessoa(nome1, email1, data1, end1);

        // Pessoa 2
        System.out.println("\n=== Pessoa 2 ===");

        System.out.print("Nome: ");
        String nome2 = teclado.nextLine();

        System.out.print("Data de nascimento: ");
        String data2 = teclado.nextLine();

        System.out.print("Email: ");
        String email2 = teclado.nextLine();

        System.out.print("Endereço: ");
        String end2 = teclado.nextLine();

        p2.inserirDadosPessoa(nome2, email2, data2, end2);

        // Promover apenas uma a admin
        System.out.println("\nPromovendo a Pessoa 1 a administrador...");
        p1.promoverAdmin(p1.nome);
        System.out.println("\nTentando promover a Pessoa 1 novamente:");
        p1.promoverAdmin(p1.nome);

        // Exibir
        System.out.println("\nPessoa 1:");
        p1.infoPessoa();

        System.out.println("\nPessoa 2:");
        p2.infoPessoa();

        // Teste getEmail
        System.out.println("\nEmail da Pessoa 1: " + p1.getEmail());
        System.out.println("Email da Pessoa 2: " + p2.getEmail());

        teclado.close();
    }
}