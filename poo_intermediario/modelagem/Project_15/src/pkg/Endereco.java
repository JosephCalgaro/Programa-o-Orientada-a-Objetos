package pkg;

public class Endereco {
    private String rua;
    private int numero;
    private Endereco endereco;

    public Endereco(String rua, int numero,  Endereco endereco) {
        this.rua = rua;
        this.numero = numero;
        this.endereco = endereco;
    }

    public String getRua() {
        return rua;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return rua + " " + numero + " " + endereco;
    }

}
