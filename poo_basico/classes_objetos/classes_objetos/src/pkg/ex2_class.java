package pkg;

import java.util.Scanner;

public class ex2_class {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        computador comp1 = new computador();
        computador comp2 = new computador();

        System.out.println("Digite a marca do computador:");
        comp1.marca = teclado.nextLine();

        System.out.println("Digite o modelo do computador:");
        comp1.modelo = teclado.nextLine();

        System.out.println("Digite o tipo do computador:");
        comp1.tipo = teclado.nextLine();

        System.out.println("Digite o preço do computador:");
        comp1.preco = teclado.nextDouble();
        teclado.nextLine();

        comp2.marca = "Apple";
        comp2.modelo = "MacBook Air";
        comp2.tipo = "Notebook";
        comp2.preco = 8500.00;

        System.out.println("\n--- Computador 1 ---");
        System.out.println("Marca: " + comp1.marca);
        System.out.println("Modelo: " + comp1.modelo);
        System.out.println("Tipo: " + comp1.tipo);
        System.out.println("Preço: " + comp1.preco);

        System.out.println("\n--- Computador 2 ---");
        System.out.println("Marca: " + comp2.marca);
        System.out.println("Modelo: " + comp2.modelo);
        System.out.println("Tipo: " + comp2.tipo);
        System.out.println("Preço: " + comp2.preco);
        
        teclado.close();

    }
}
