package pkg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex1_exception {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Informe um número: ");
            int num = teclado.nextInt();

            if (num < 0) {
                throw new ArithmeticException("Número negativo não possui raiz real.");
            }

            double raiz = Math.sqrt(num);
            System.out.println("Raiz quadrada: " + raiz);

        } catch (InputMismatchException e) {
            System.out.println("Formato inválido! Digite um número inteiro.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exceção: " + e.toString());
        } finally {
            teclado.close();
        }
    }
}