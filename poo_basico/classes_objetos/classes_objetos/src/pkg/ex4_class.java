package pkg;

public class ex4_class {

    public static void main(String[] args) {

        livro livro1 = new livro();

        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.anoPublicacao = 1899;

        System.out.println("Título: " + livro1.titulo);
        System.out.println("Autor: " + livro1.autor);
        System.out.println("Ano de publicação: " + livro1.anoPublicacao);

    }
}

