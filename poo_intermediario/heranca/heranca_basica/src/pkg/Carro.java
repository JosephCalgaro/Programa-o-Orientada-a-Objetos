package pkg;

public class Carro {
    protected String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirMSG(){

        System.out.println("Nome: " + this.nome);
    }
}
