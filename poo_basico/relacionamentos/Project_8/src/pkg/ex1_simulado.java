package pkg;

import java.util.Scanner;


public class ex1_simulado {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        String nome = teclado.nextLine();
        System.out.println("Digite o preço do produto: ");
        double preco = teclado.nextDouble();
        System.out.println("Digite a quantidade em estoque: ");
        int quantidade = teclado.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);

        System.out.println("Valor total em estoque: " + produto.calcularValorTotalEstoque());
        System.out.println("O produto tem estoque: " + produto.temEstoque());
        System.out.println("Adicionando unidades ao estoque...");
        int quantidadeAdicionar = teclado.nextInt();
        produto.adcicionarEstoque(quantidadeAdicionar);
        System.out.println("Novo valor total em estoque: " + produto.calcularValorTotalEstoque());
        System.out.println("Vendendo unidades do produto...");
        int quantidadeVender = teclado.nextInt();
        if(produto.venderEstoque(quantidadeVender)){
            System.out.println("Venda realizada com sucesso!");
        }else{
            System.out.println("Não foi possível realizar a venda. Verifique a quantidade disponível.");
        }

    }

}
