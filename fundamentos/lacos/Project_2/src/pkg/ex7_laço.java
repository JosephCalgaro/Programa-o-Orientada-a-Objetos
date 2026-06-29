package pkg;

import java.util.Scanner;

public class ex7_laço {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 1;
		double nota = 0;
		do {
			System.out.println("Declare a nota do aluno "+i+", se quiser sair do laço digite  -1: ");
			nota = teclado.nextDouble();
			i++;
		}while(nota!=-1);
		teclado.close();
	}

}
