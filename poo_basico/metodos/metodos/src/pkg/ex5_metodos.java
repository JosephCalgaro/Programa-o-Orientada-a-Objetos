package pkg;

import java.util.Scanner;

public class ex5_metodos {
    
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha o construtor: ");
        System.out.println("1 - Construtor com nome e idade");
        System.out.println("2 - Construtor com idade");

        int op = teclado.nextInt();
        teclado.nextLine();

        pessoaEx5 p;

        if(op == 1){
            System.out.println("Digite o nome:");
            String nome = teclado.next();
            System.out.println("Digite a idade:");
            int idade = teclado.nextInt();
            p = new pessoaEx5(nome, idade);
        } else if(op == 2){
            System.out.println("Digite a idade:");
            int idade = teclado.nextInt();
            p = new pessoaEx5(idade);
        } else {
            System.out.println("Opção inválida!");
        }

        teclado.close();
    }
}
