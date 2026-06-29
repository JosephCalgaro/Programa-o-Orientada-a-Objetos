package exercicios;

public class Exercicio4 {
    public static void main(String[] args) {
        Carro c = new Carro("Toyota", "Corolla", 2020);
        c.acelerar();
        c.frear();

        Moto m = new Moto("Honda", "CBR", 2021);
        m.acelerar();
        m.frear();
    }
}
