package pkg;

public class pessoa {
    private String nome;
    private int idade;

    public pessoa(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setNome(String nome){
        if(nome.isBlank() || nome.isEmpty() || nome == null){
            System.err.println("Preencha o nome do pessoa.");
        }else {
            this.nome = nome;
        }
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade invalida, impossivel atribuir valor");
        } else {
            this.idade = idade;
        }
    }
}
