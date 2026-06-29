package Relacionamento;

public class Exercicio8 {
    public static void main(String[] args) {

        // polimorfismo
        Reserva[] reservas = new Reserva[2];

        reservas[0] =
                new ReservaDeHotel("Joseph");

        reservas[1] =
                new ReservaDeVoo("Maria");

        // adicionar reservas
        reservas[0].adicionar();

        reservas[1].adicionar();

        System.out.println();

        // cancelamentos específicos
        for (Reserva r : reservas) {

            r.cancelar();
        }

        System.out.println();

        // sobrecarga em ReservaDeVoo
        ReservaDeVoo voo =
                new ReservaDeVoo("Carlos");

        voo.adicionar("Econômica");

        voo.adicionar("Executiva", 15);
    }
}

