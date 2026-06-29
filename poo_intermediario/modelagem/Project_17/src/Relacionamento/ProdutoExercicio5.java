package Relacionamento;

public class ProdutoExercicio5 {

    private String nome;
    private double preco;
    private int quantidade;

    public ProdutoExercicio5(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // método normal
    public double calcularPrecoFinal(double preco) {
        return preco;
    }

    // sobrecarga usando Cliente
    public double calcularPrecoFinal(Cliente cliente) {

        double desconto = preco * (cliente.getDesconto() / 100);

        return preco - desconto;
    }
}
