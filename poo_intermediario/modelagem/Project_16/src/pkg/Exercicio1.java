package pkg;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Notebook", 3500.00, 10));
        produtos.add(new Produto("Mouse", 89.90, 50));
        produtos.add(new Produto("Teclado", 149.90, 30));
        produtos.add(new Produto("Monitor", 1200.00, 15));
        produtos.add(new Produto("Headset", 299.99, 25));

        System.out.println("=== Lista de Produtos ===");
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
