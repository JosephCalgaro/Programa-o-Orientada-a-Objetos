package pkg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex2_exception {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        try{
            System.out.println("Informe o primeiro numero: ");
            double n1 = teclado.nextDouble();

            System.out.println("Informe o segundo numero: ");
            double n2 = teclado.nextDouble();

            System.out.println("Informe a operação que deseja usar (+, -, /, *): ");
            char op = teclado.next().charAt(0);

            double resultado;

            switch (op) {
                case '+':
                    resultado = n1 + n2;
                    break;
                case '-':
                    resultado = n1 - n2;
                    break;
                case '*':
                    resultado = n1 * n2;
                    break;
                case '/':
                    if(n2 == 0 || n1 == 0){
                        throw new ArithmeticException("A divisão por zero não é permitida");
                    }
                    resultado = n1 / n2;
                    break;
                default:
                    throw new IllegalArgumentException("Operador inválido");

            }
            System.out.println("Resultado: "+resultado);
        } catch(InputMismatchException e){
            System.out.println("Erro: Voce deve digitar numeros validos");
        } catch(ArithmeticException e){
            System.out.println("Erro matemátio: "+e.getMessage());
        } catch(IllegalArgumentException e){
            System.out.println("Erro: "+e.getMessage());
        } catch(Exception e){
            System.out.println("Erro inesperado: "+e.toString());
        } finally{
            teclado.close();
        }
    }

}
