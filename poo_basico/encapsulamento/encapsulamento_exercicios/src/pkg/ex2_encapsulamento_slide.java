package pkg;

import java.util.Scanner;

public class ex2_encapsulamento_slide {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do raio do circulo: ");
        float raio = teclado.nextFloat();
        if(raio<0){
            System.out.println("Valor não pode ser negativo");
        }

        Circulo c = new Circulo(raio);

        System.out.println("O valor da area do circulo é: "+c.cacularArea());

    }
}
