package Relacionamento;

public class Netbook extends Computador {


    public Netbook(String marca, String modelo) {
        super(marca, modelo);
    }

    public void ExibeMarca(String marca) {
        System.out.println("Marca: " + marca);
    }

    public static class Main {
        public static void main(String[] args) {
            Netbook netbook = new Netbook("HP", "Pavilion");
            netbook.ExibeMarca(netbook.getMarca());
            netbook.ExibeModelo(netbook.getModelo());
        }


    }
}

