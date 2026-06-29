package pkg;


import java.util.Scanner;

public class ex6_exception {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double premio = 5000.0;

        try {
            System.out.print("Quantos ganhadores dividirão o prêmio? ");
            int pessoas = teclado.nextInt();

            if (pessoas == 0) {
                throw new ArithmeticException("Não é possível dividir por zero.");
            }

            double valorPorPessoa = premio / pessoas;

            System.out.println("Cada pessoa receberá: R$ " + valorPorPessoa);

        } catch (InputMismatchException e) {
            System.out.println("Erro: digite um número inteiro válido.");
        } catch (ArithmeticException e) {
            System.out.println("Erro matemático: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.toString());
        } finally {
            teclado.close();
        }
    }
}