package pkg;

public class ex1_extends {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.nome = "Teste";
        c.idade = 12;
        c.som = "late";
        c.setRaca("Border Collie");
        c.latir();
        c.exibirMSG();
    }
}
