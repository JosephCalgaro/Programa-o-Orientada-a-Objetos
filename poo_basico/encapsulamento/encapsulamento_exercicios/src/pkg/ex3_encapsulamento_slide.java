package pkg;

import java.util.Scanner;

public class ex3_encapsulamento_slide {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor da base do retangulo:: ");
        double base = teclado.nextDouble();
        System.out.println("Digite o valor da altura do retangulo: ");
        double altura = teclado.nextDouble();

        Retangulo r = new Retangulo(base,altura);

        System.out.println("O valor da area do retangulo é: "+r.calcularArea());
    }

}
