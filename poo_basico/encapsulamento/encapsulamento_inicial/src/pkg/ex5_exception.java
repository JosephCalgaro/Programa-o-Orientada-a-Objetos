package pkg;

import java.util.Scanner;

public class ex5_exception {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Digite a temperatura em Celsius: ");
            String entrada = teclado.nextLine();

            double celsius = Double.parseDouble(entrada);

            double fahrenheit = (celsius * 9/5) + 32;

            System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        } catch (NumberFormatException e) {
            System.out.println("Erro: valor inválido! Use ponto (ex: 25.5).");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.toString());
        } finally {
            teclado.close();
        }
    }
}