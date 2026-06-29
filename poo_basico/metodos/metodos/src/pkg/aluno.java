package pkg;


public class aluno {
    String nome;
    String matricula;
    String dataNascimento;
    int anoIngresso;

    //Contrutor 1: nome + matricula
    public aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;

        System.out.println("Construtor 1: ");
        System.out.println("Nome: "+nome);
        System.out.println("Matricula: "+matricula);
    }

    //Construtor 2: apenas data de nascimento
    public aluno(String dataNascimento){
        this.dataNascimento = dataNascimento;

        System.out.println("\nCosntrutor 2: ");
        System.out.println("Data de Nascimento: "+dataNascimento);
    }

    //Construtor 3: nome + data nascimento + ano ingresso
    public aluno(String nome, String dataNascimento, int anoIngresso){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.anoIngresso = anoIngresso;

        System.out.println("\nConstrutor 3: ");
        System.out.println("Nome: "+nome);
        System.out.println("Data de Nascimento: "+dataNascimento);
        System.out.println("Ano de Ingresso: "+anoIngresso);
    }
    
}
