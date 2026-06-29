package pkg;

public class pessoa {
    String nome;
    String email;
    String dataNascimento;
    String endereco;
    boolean admin;

    public void inserirDadosPessoa(String nome, String email, String dataNascimento, String endereco){
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.admin = false; // Inicialmente, a pessoa não é um administrador
    }

    public String getEmail(){
        return this.email;
    }
    
    public void promoverAdmin(String nome){
        if(!admin){
            admin = true;
            System.out.println(nome + " promovida a administrador com sucesso!");
        } else {
            System.out.println(nome + " já é um administrador.");
        }
    }

    public void infoPessoa(){
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Endereço: " + endereco);
        System.out.println("Administrador: " + (admin ? "Sim" : "Não"));
    }
}
