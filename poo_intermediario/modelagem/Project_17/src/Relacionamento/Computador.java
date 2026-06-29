package Relacionamento;

public class Computador {
    protected String Marca;
    private String Modelo;

    public Computador(String marca, String modelo) {
        Marca = marca;
        Modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public void ExibeModelo(String Modelo) {
        System.out.println("Modelo: " + Modelo);

    }
}
