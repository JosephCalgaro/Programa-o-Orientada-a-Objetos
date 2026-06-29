package Relacionamento;

import java.util.ArrayList;

public class Exercicio9 {

    public static void main(String[] args) {

        ArrayList<ProdutoExercicio9> produtos =
                new ArrayList<>();

        produtos.add(new ProdutoExercicio9("Notebook", 3500, 2));

        produtos.add(new ProdutoExercicio9("Mouse", 120, 10));

        produtos.add(new ProdutoExercicio9("Teclado", 250, 5));

        // percorrendo a lista
        for (ProdutoExercicio9 p : produtos) {

            System.out.println("----------------");

            System.out.println(p);
        }
    }
}