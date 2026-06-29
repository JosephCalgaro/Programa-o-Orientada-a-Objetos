

import java.util.Scanner;

public class ex3_exception {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Digite um valor: ");
            String entrada = teclado.nextLine();

            double numero = Double.parseDouble(entrada);

            System.out.println("Valor convertido: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Erro: não foi possível converter para número.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.toString());
        } finally {
            teclado.close();
        }
    }
}