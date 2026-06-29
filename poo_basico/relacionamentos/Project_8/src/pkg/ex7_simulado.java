package pkg;

import java.util.Scanner;

public class ex7_simulado {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero do pedido: ");
        int numero = teclado.nextInt();
        System.out.println("Digite o nome do produto: ");
        teclado.nextLine();
        String produto = teclado.nextLine();
        System.out.println("Digite o preço unitário: ");
        double preco = teclado.nextDouble();
        System.out.println("Digite a quantidade: ");
        int quantidade = teclado.nextInt();
        Pedido pedido = new Pedido(numero, produto, preco, quantidade);

        System.out.println("Digite o percentual de desconto: ");
        double percentualDesconto = teclado.nextDouble();
        System.out.println(pedido.resumoPedido(percentualDesconto));
    }

}
