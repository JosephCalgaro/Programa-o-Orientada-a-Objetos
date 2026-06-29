package pkg;

public class Pessoa {
    private String nome;
    private int idade;
    private int cpf;

    public Pessoa(String nome, int idade, int cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void verificaMaiorIdade(){
        if(this.idade < 18){
            System.out.println("Individuo não é maior de idade");

        } else {
            System.out.println("Individuo é maior de idade");
        }


    }
}
