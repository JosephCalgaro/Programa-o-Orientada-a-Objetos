package Relacionamento;

public class NotificacaoEmail extends Notificacao {

    // sobrescrita
    @Override
    public void enviar() {
        System.out.println("Enviando e-mail para 1 destinatário.");
    }

    // sobrecarga
    public void enviar(String destinatario) {
        System.out.println("E-mail enviado para: " + destinatario);
    }

    // sobrecarga com vários destinatários
    public void enviar(String destinatario1, String destinatario2) {
        System.out.println("E-mail enviado para:");
        System.out.println(destinatario1);
        System.out.println(destinatario2);
    }
}
