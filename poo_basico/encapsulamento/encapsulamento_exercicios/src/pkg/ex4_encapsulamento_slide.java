package pkg;

import java.util.Scanner;

public class ex4_encapsulamento_slide {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a marca do carro: ");
        String marca = teclado.nextLine();
        System.out.print("Digite o  modelo do carro: ");
        String modelo = teclado.nextLine();
        System.out.print("Digite o ano de fabricação do carro: ");
        int ano = teclado.nextInt();

        Carro c = new Carro(marca, modelo, ano);

        System.out.println("Detalhes do carro: ");
        c.exibeDetalhes();


    }
}
