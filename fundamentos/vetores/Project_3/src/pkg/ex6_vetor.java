package pkg;

import java.util.Scanner;

public class ex6_vetor {

	public static void main(String[] args) {
		String cidades[] = new String[5];
		int populacao[] = new int[5];
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("informe o nome da "+(i+1)+" cidade: ");
			cidades[i] = teclado.nextLine();
			System.out.println("informe seu total populacional: ");
			populacao[i] = teclado.nextInt();
			teclado.nextLine();
			}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(cidades[i]+" possui "+populacao[i]+" habitantes");
		}
		teclado.close();

	}

}
