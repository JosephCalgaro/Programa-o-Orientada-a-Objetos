package pkg;

public class livro {
    String titulo;
    String autor;
    int anoPublicacao;
    String genero;
    boolean emprestado;

    public void inserirDados(String titulo, String autor, int anoPublicacao, String genero, boolean emprestado){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.emprestado = false; // Inicialmente, o livro não está emprestado
    }
    

    public void infoLivro(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Gênero: " + genero);
        System.out.println("Emprestado: " + (emprestado ? "Sim" : "Não"));
    }

    public void emprestarLivro(){
        if(!emprestado){
            emprestado = true;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Livro já está emprestado.");
        }
    }

    public void devolverLivro(){
        if(emprestado){
            emprestado = false;
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Livro não está emprestado.");
        }
    }

}
