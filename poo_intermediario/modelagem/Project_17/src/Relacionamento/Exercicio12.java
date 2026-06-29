package Relacionamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Exercicio12 {

    public static void main(String[] args) {

        ArrayList<Livro> livros = new ArrayList<>();

        livros.add(new Livro("Dom Casmurro", "Machado de Assis", 1899));

        livros.add(new Livro("Harry Potter", "J.K Rowling", 1997));

        livros.add(new Livro("O Hobbit", "J.R.R Tolkien", 1937));

        // ordenar pelo ano
        Collections.sort(livros, Comparator.comparing(Livro::getAno));

        // imprimir livros
        for (Livro l : livros) {

            System.out.println("----------------");

            System.out.println(l);
        }
    }
}