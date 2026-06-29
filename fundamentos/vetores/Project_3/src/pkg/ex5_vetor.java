package pkg;

import java.util.Scanner;

public class ex5_vetor {

	public static void main(String[] args) {
		int vetor[] = new int[10];
		Scanner teclado = new Scanner(System.in);
		for(int i = 0; i<vetor.length; i++) {
			System.out.println("Insira o "+(i+1)+" numero");
			vetor[i] = teclado.nextInt();
			}
		
		int maior = vetor[0];
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		int menor = vetor[0];
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		System.out.println("O maior valor é "+maior);
		System.out.println("O menor valor é "+menor);

	}

}
