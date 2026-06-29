package pkg;

public class Onibus extends Carro{
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void exibirMSG(){
        System.out.println("Estou na classe Onibus");
        System.out.println("Nome: " + this.nome);
        System.out.println("Modelo: " + this.modelo);
    }
}
