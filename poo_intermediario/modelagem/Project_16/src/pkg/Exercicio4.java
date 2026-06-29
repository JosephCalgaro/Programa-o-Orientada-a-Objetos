package pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercicio4 {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>();

        livros.add(new Livro("Dom Casmurro", "Machado de Assis", 1899));
        livros.add(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954));
        livros.add(new Livro("Harry Potter", "J.K. Rowling", 1997));
        livros.add(new Livro("1984", "George Orwell", 1949));
        livros.add(new Livro("O Alquimista", "Paulo Coelho", 1988));

        Collections.sort(livros, Comparator.comparingInt(Livro::getAno));

        System.out.println("=== Livros Ordenados por Ano de Lançamento ===");
        for (Livro l : livros) {
            System.out.println(l);
        }
    }
}
