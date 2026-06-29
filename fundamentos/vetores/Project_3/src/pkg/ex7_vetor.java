package pkg;

import java.util.Scanner;

public class ex7_vetor {

    public static void main(String[] args) {

        double notas[][] = new double[3][4];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Aluno " + (i + 1));
            
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a nota da disciplina " + (j + 1) + ": ");
                notas[i][j] = teclado.nextDouble();
            }
        }


        for (int j = 0; j < 4; j++) {

            double maior = notas[0][j];
            double menor = notas[0][j];

            for (int i = 1; i < 3; i++) {

                if (notas[i][j] > maior) {
                    maior = notas[i][j];
                }

                if (notas[i][j] < menor) {
                    menor = notas[i][j];
                }
            }

            System.out.println("Disciplina " + (j + 1) + ":");
            System.out.println("Maior nota: " + maior);
            System.out.println("Menor nota: " + menor);
            System.out.println();
        }

        teclado.close();
    }
}