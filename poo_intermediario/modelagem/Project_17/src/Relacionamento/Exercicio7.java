package Relacionamento;

public class Exercicio7 {
    public static void main(String[] args) {

        // polimorfismo
        Notificacao n1 = new NotificacaoEmail();
        Notificacao n2 = new NotificacaoApp();

        n1.enviar();
        n2.enviar();

        System.out.println();

        NotificacaoEmail email = new NotificacaoEmail();

        // sobrecarga
        email.enviar("joseph@gmail.com");

        System.out.println();

        email.enviar("cliente1@gmail.com", "cliente2@gmail.com");
    }
}
