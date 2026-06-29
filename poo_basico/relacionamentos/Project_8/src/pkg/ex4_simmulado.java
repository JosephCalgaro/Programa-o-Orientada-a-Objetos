package pkg;

import java.util.Scanner;

public class ex4_simmulado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();

        Retangulo retangulo = new Retangulo(altura, largura);

        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
        System.out.println("Diagonal: " + retangulo.calcularDiagonal());
        System.out.println("É um quadrado? " + retangulo.eQuadrado());

        scanner.close();
    }

}
