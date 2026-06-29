package pkg;

import java.util.Scanner;

	public class ex8_laço {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 1;
		String cidade = "";
		do {
			System.out.println("Declare o nome da"+i+" cidade, se quiser sair do laço decare São Paulo: ");
			cidade = teclado.nextLine();
			i++;
		}while(!cidade.equalsIgnoreCase("São Paulo"));
		teclado.close();
	}
}
