package Relacionamento;

public class Reserva {

    protected String cliente;

    public Reserva(String cliente) {
        this.cliente = cliente;
    }

    public void adicionar() {
        System.out.println("Reserva adicionada.");
    }

    public void cancelar() {
        System.out.println("Reserva cancelada.");
    }
}