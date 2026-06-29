package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n = teclado.nextInt();
		System.out.println("Nuemor inteiro digitado: "+n);
		double n1 = teclado.nextDouble();
		System.out.println("Numero double digitado: "+n1);
		teclado.nextLine();
		String palavra = teclado.nextLine();
		System.out.println("Palavra digitada"+palavra);
		teclado.nextLine();
		palavra = teclado.next();
		System.out.println("String digitada com .next: "+palavra);

		
		teclado.close();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("a variavel i no metodo for  vale: " +  i);
		}
		
		int i = 0;
		while(i<10) {
			System.out.println("a variavel i no metodo while vale: "+ i);
			i++;
		}
		
		i = 0;
		do {
			System.out.println("a variavel i no metodo do while vale: "+ i);
			i++;
		}while(i<10);
	}

}
