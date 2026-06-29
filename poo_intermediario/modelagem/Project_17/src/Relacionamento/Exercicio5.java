package Relacionamento;

public class Exercicio5 {
    public static void main(String[] args) {

        ProdutoExercicio5 produto = new ProdutoExercicio5("Notebook", 3000, 2);

        Cliente cliente = new Cliente("Joseph", 10);

        System.out.println("Preço normal: R$ " + produto.calcularPrecoFinal(produto.getPreco()));

        System.out.println("Preço com desconto: R$ " + produto.calcularPrecoFinal(cliente));
    }
}
