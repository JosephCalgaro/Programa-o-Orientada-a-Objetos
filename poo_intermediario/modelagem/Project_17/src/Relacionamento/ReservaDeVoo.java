package Relacionamento;

public class ReservaDeVoo extends Reserva {

    public ReservaDeVoo(String cliente) {
        super(cliente);
    }

    // método padrão
    @Override
    public void adicionar() {
        System.out.println(
                "Reserva de voo adicionada."
        );
    }

    // sobrecarga - classe econômica
    public void adicionar(String classe) {

        System.out.println(
                "Reserva de voo na classe " +
                        classe + " adicionada."
        );
    }

    // sobrecarga - econômica ou executiva com assento
    public void adicionar(String classe, int assento) {

        System.out.println(
                "Reserva de voo na classe " +
                        classe +
                        " adicionada no assento " +
                        assento
        );
    }

    @Override
    public void cancelar() {

        System.out.println(
                "Reserva de voo cancelada com multa de 20%."
        );
    }
}
