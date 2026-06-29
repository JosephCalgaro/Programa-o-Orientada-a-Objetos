package exercicios;

public class PessoaFisica extends Pessoa {
    private String CPF;
    private String RG;


    public PessoaFisica(String nome, String cidade, String CPF, String RG) {
        super(nome, cidade);
        this.CPF = CPF;
        this.RG = RG;
    }

    @Override
    public void efetuarCompra(){
        System.out.println("Pessoa Física efetuou uma compra.");
    }
}
