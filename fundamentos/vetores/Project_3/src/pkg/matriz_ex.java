package pkg;

import java.util.Scanner;

public class matriz_ex {

	public static void main(String[] args) {
		int[][] matriz = new int[2][2];
		Scanner teclado = new Scanner(System.in);
		for( int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.println("Digite o elemento["+i+"]["+j+"]");
				matriz[i][j] = teclado.nextInt();
			}
		}
		for( int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.print("\n");
		}
		teclado.close();
	}

}
