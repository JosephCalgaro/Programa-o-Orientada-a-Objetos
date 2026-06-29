package pkg;

import java.util.Scanner;

public class ex6_laço {
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 1;
		do {
			System.out.println("Declare um numero, se quiser sair do laço digite  0: ");
			i = teclado.nextInt();
		}while(i!=0);
		
	}
}
