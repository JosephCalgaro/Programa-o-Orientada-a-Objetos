package pkg;

import java.util.Scanner;

public class ex5_encapsulamento_slide {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do lado A: ");
        int a = teclado.nextInt();
        System.out.print("Digite o valor do lado B: ");
        int b = teclado.nextInt();
        System.out.print("Digite o valor do lado C: ");
        int c = teclado.nextInt();

        Triangulo t = new Triangulo(a, b, c);

        t.verificaEquilatero();

    }
}
