package pkg;

public class PessoaJuridia extends Pessoa {
    private String cnpj;
    private String socio;
    private String dtAbertura;

    public PessoaJuridia(String nome, int idade, String cnpj, String socio, String dtAbertura) {
        super(nome, idade);
        this.cnpj = cnpj;
        this.socio = socio;
        this.dtAbertura = dtAbertura;
    }

    @Override
    public void exibeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Socio: " + this.socio);
        System.out.println("Data de Abertura: " + this.dtAbertura);
    }
}
