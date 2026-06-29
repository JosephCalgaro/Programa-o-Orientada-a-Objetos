package pkg;

public class Pedido {
    int numero;
    String produto;
    double preco;
    int quantidade;

    public Pedido(int numero, String produto, double preco, int quantidade){
        this.numero = numero;
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularSubtotal(){
        return this.preco * this.quantidade;
    }

    public double calcularDesconto(double percentual){
        return this.calcularSubtotal() * (percentual / 100);
    }

    public double calcularTotal(double percentualDesconto){
        return this.calcularSubtotal() - this.calcularDesconto(percentualDesconto);
    }

    public String resumoPedido(double percentualDesconto){
        return "Número do pedido: " + this.numero +
            "\nProduto: " + this.produto +
            "\nPreço unitário: " + this.preco +
            "\nQuantidade: " + this.quantidade +
            "\nSubtotal: " + this.calcularSubtotal() +
            "\nDesconto: " + this.calcularDesconto(percentualDesconto) +
            "\nTotal a pagar: " + this.calcularTotal(percentualDesconto);
    }
}