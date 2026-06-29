package pkg;

public class Principal {

    public static void main(String[] args) {
        Carro c = new Carro();
        c.nome = "Fusca";
        c.exibirMSG();
        Onibus o = new Onibus();
        o.nome = "Marco Polo";
        o.setModelo("sla");
        o.exibirMSG();
    }
}
