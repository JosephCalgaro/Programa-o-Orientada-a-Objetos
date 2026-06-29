package pkg;

import java.util.Scanner;

public class ex3_vetor {

	public static void main(String[] args) {
		double[] vetor = new double[5];
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i<vetor.length; i++) {
			System.out.println("Informe a nota do aluno "+(i+1));
			vetor[i] = teclado.nextDouble();
		}
		
		for(int i = 0; i<vetor.length; i++) {
			System.out.println("A nota do aluno "+(i+1)+" é "+vetor[i]);
		}
	}

}
