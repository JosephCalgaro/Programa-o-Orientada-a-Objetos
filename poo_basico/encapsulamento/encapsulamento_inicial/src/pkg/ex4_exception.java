package pkg;

import java.util.Scanner;

public class ex4_exception {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        String[] nomes = {"Ana", "Carlos", "João", "Maria", "Pedro"};

        try {
            System.out.print("Digite um índice de 0 a 4: ");
            int indice = teclado.nextInt();

            System.out.println("Nome: " + nomes[indice]);

        } catch (InputMismatchException e) {
            System.out.println("Erro: você deve digitar um número inteiro.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: índice fora do intervalo permitido (0 a 4).");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.toString());
        } finally {
            teclado.close();
        }
    }
}