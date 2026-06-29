package pkg_4;

import java.util.Scanner;

public class Netbook extends Computador {

    public Netbook(String marca) {
        super(marca);
    }

    public String exibeMarca() {
        return marca;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a marca do netbook: ");
        String marca = ler.nextLine();

        Netbook n = new Netbook(marca);

        System.out.println("Marca: " + n.exibeMarca());
        System.out.println("Modelo: " + n.exibeModelo());

        ler.close();
    }
}