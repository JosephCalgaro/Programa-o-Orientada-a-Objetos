package pkg_4;

import java.util.Scanner;

public class Notebook extends Computador {

    public Notebook(String marca) {
        super(marca);
    }

    public String exibeMarca() {
        return marca;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a marca do notebook: ");
        String marca = ler.nextLine();

        Notebook n = new Notebook(marca);

        System.out.println("Marca: " + n.exibeMarca());
        System.out.println("Modelo: " + n.exibeModelo());

        ler.close();
    }
}