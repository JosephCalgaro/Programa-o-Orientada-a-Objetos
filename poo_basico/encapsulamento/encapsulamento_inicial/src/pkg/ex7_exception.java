package pkg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex7_exception {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            int num = teclado.nextInt();

            int resultado = 10 / num;

            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Erro: você deve digitar um número inteiro.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.toString());
        } finally {
            teclado.close();
        }
    }
}

/**
Principais exceções em Java:

InputMismatchException:
Ocorre quando o usuário digita um tipo de dado diferente do esperado.
Exemplo: digitar letras quando o programa espera um número inteiro com Scanner.

NumberFormatException:
Ocorre ao tentar converter uma String para número e o valor é inválido.
Exemplo: "12a" ao usar Integer.parseInt() ou Double.parseDouble().

ArithmeticException:
Ocorre em erros matemáticos, como divisão por zero.

ArrayIndexOutOfBoundsException:
Ocorre quando tentamos acessar uma posição inválida de um array.
Exemplo: acessar índice 10 em um array de tamanho 5.

NullPointerException:
Ocorre quando tentamos usar um objeto que está com valor null.

IllegalArgumentException:
Ocorre quando um método recebe um argumento inválido.

IOException:
Ocorre em operações de entrada e saída, como leitura de arquivos.
 */