package pkg;

import java.util.Scanner;

public class ex5_class {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        produto produto1 = new produto();

        System.out.println("Digite o nome do produto:");
        produto1.nome = teclado.nextLine();

        System.out.println("Digite o preço do produto:");
        produto1.preco = teclado.nextDouble();

        System.out.println("Digite a quantidade em estoque:");
        produto1.quantidadeEmEstoque = teclado.nextInt();

        double valorTotal = produto1.preco * produto1.quantidadeEmEstoque;

        System.out.println("\n--- Informações do Produto ---");
        System.out.println("Nome: " + produto1.nome);
        System.out.println("Preço: " + produto1.preco);
        System.out.println("Quantidade em estoque: " + produto1.quantidadeEmEstoque);
        System.out.println("Valor total em estoque: " + valorTotal);

        teclado.close();
    }
}
