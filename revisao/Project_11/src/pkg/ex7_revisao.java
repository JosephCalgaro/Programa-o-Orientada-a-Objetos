package pkg;

import java.util.Scanner;
public class ex7_revisao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        String nome = teclado.nextLine();
        System.out.println("Digite o preço do produto: ");
        double preco = teclado.nextDouble();
        System.out.println("Digite a quantidade do produto: ");
        int quantidade = teclado.nextInt();

        Produto produto1 = new Produto(nome, preco, quantidade);
        produto1.exibirInformações();
        System.out.println("Valor total do produto: " + produto1.calcularValorTotal());

        Produto produto2 = new Produto("Notebook", 3500.00, 2);
        produto2.exibirInformações();
        System.out.println("Valor total do produto: " + produto2.calcularValorTotal());
        teclado.close();
    }

}
