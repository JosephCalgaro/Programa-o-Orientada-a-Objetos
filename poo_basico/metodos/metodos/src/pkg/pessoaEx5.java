package pkg;


public class pessoaEx5 {
    String nome;
    int idade;

    //construtor 1
    public pessoaEx5(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        System.out.println("Construtor com nome e idade: ");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
    }

    //construtor 2
    public pessoaEx5(int idade){
        this.idade = idade;
        System.out.println("Construtor com idade: ");
        System.out.println("Idade: "+idade);
    }
}
