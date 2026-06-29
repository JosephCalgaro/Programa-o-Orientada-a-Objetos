package pkg;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularValorTotalEstoque(){
        return this.preco * this.quantidade;
    }

    public boolean temEstoque(){
        return this.quantidade > 0;
    }

    public void adcicionarEstoque(int quantidade){
        this.quantidade += quantidade;
    }

    public boolean venderEstoque(int quantidade){
        if(quantidade <= this.quantidade && quantidade > 0 && this.temEstoque()){
            this.quantidade -= quantidade;
            return true;
        }else{
            return false;
        }
        }
    }

