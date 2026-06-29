package pkg;

import java.util.Scanner;

public class ex1_class {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		carro carro1 = new carro();
		carro carro2 = new carro();
		
		System.out.println("Digite a marca do primeiro carro: ");
		carro1.marca = teclado.nextLine();
		
		System.out.println("Digite o modelo do primeiro carro: ");
		carro1.modelo = teclado.nextLine();
		
        System.out.println("Digite o ano de fabricação do primeiro carro:");
        carro1.anoFabricacao = teclado.nextInt();
        teclado.nextLine();
        
		System.out.println("Digite a marca do segundo carro: ");
		carro2.marca = teclado.nextLine();
		
		System.out.println("Digite o modelo do segundo carro: ");
		carro2.modelo = teclado.nextLine();
		
        System.out.println("Digite o ano de fabricação do segundo carro:");
        carro2.anoFabricacao = teclado.nextInt();
        teclado.close();
        
        System.out.println("\n--- Dados do Primeiro Carro ---");
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano: " + carro1.anoFabricacao);

        System.out.println("\n--- Dados do Segundo Carro ---");
        System.out.println("Marca: " + carro2.marca);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.anoFabricacao);
        
	}

}
