package Relacionamento;


public class ReservaDeHotel extends Reserva {

    public ReservaDeHotel(String cliente) {
        super(cliente);
    }

    @Override
    public void cancelar() {
        System.out.println(
                "Reserva de hotel cancelada com taxa de 10%."
        );
    }
}