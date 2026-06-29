package Relacionamento;

public class ProdutoExercicio9 {

    private String nome;
    private double preco;
    private int quantidade;

    public ProdutoExercicio9(String nome,
                             double preco,
                             int quantidade) {

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {

        return "Produto: " + nome + "\nPreço: R$ " + preco + "\nQuantidade: " + quantidade;
    }
}
