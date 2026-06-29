package pkg;

import java.util.Scanner;

public class ex2_metodos {
    public static void main(String[] args) {
        livro l = new livro();
        Scanner teclado = new Scanner(System.in);

        //valores originais
        System.out.println("Valores originais");
        l.infoLivro();

        //entrada do usuario
        System.out.println("\nDigite os dados do livro:");
        System.out.println("Digite o título do livro:");
        String titulo = teclado.nextLine();
        System.out.println("Digite o autor do livro:");
        String autor = teclado.nextLine();
        System.out.println("Digite o ano de publicação do livro:");
        int anoPublicacao = teclado.nextInt();
        teclado.nextLine(); // Limpar o buffer do scanner
        System.out.println("Digite o gênero do livro:");
        String genero = teclado.nextLine();

        l.inserirDados(titulo, autor, anoPublicacao, genero, false);
        System.out.println("\nDados atualizados:");
        l.infoLivro();


        //emprestimo do livro
        System.out.println("\nEmprestando o livro...");
        l.emprestarLivro();
        System.out.println("\nInformações do livro após empréstimo:");
        l.infoLivro();

        //devolução do livro
        System.out.println("\nDevolvendo o livro...");
        l.devolverLivro();
        System.out.println("\nInformações do livro após devolução:");
        l.infoLivro();
    }
}
