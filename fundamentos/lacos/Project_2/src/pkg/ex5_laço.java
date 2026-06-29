package pkg;

import java.util.Scanner;

public class ex5_laço {

	public static void main(String[] args) {
		int fat = 0;
		int total = 1;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um numero que deseja descobrir o fatorial");
		fat = teclado.nextInt();
		
		for(int i = 1; i < fat+1; i++) {
			total = total * i;
		}
		
		System.out.println("O fatorial de "+fat+" é "+total);
		
		teclado.close();
	}

}
