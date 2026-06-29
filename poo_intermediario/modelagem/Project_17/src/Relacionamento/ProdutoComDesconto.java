package Relacionamento;

public class ProdutoComDesconto extends Produto{

    public ProdutoComDesconto(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void desconto(double valor) {
        valor = this.getPreco() - (this.getPreco()*0.3); // Valor fixo de desconto
        super.desconto(valor); // Chama o método da classe pai para aplicar o desconto
        System.out.println("Preço com desconto pre-definido: " + valor);
    }
}
