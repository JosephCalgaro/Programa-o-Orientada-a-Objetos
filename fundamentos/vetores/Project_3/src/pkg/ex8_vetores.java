package pkg;

import java.util.Scanner;

public class ex8_vetores {

	public static void main(String[] args) {
		int vetor[] = new int[10];
		Scanner teclado = new Scanner(System.in);

		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Insira o "+(i+1)+" numero");
			vetor[i] = teclado.nextInt();
		}
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i]%2 == 0) {
				System.out.println("O numero "+vetor[i]+" é par");
			}else {
				System.out.println("O numero "+vetor[i]+" é impar");
			}
		}
		teclado.close();
	}

}
