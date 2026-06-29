package Relacionamento;

public class Exercicio2 {
    public static void main(String[] args) {
        Produto p = new Produto("Smartphone", 1500.00);
        System.out.println("Produto: " + p.getNome());
        System.out.println("Preço original: " + p.getPreco());
        p.desconto(200.00);
        System.out.println("Preço com desconto: " + p.getPreco());

        ProdutoComDesconto pd = new ProdutoComDesconto("Notebook", 3000.00);
        System.out.println("\nProduto: " + pd.getNome());
        System.out.println("Preço original: " + pd.getPreco());
        pd.desconto(0); // O valor do desconto é fixo dentro do método
    }
}
