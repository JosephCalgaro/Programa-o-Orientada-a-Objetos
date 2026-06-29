package pkg;

import java.util.Scanner;

public class ex1_encapsulamento {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        //instancia da classe pessoa
        pessoa p = new pessoa("Joseph", 19);
        System.out.println("Nome: "+p.getNome());
        System.out.println("Idade: "+p.getIdade());
        System.out.println("Informe um novo nome: ");
        String nome;
        nome = teclado.nextLine();
        p.setNome(nome);
        System.out.println("Informe uma nova idade: ");
        p.setIdade(teclado.nextInt());

        System.out.println("Nome: "+p.getNome());
        System.out.println("Idade: "+p.getIdade());
    }
}