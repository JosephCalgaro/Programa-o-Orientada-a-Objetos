package exercicios;

public class PessoaJuridica extends Pessoa{

    private String CNPJ;


    public PessoaJuridica(String nome, String cidade, String CNPJ) {
        super(nome, cidade);
        this.CNPJ = CNPJ;
    }

    @Override
    public void efetuarCompra(){
        System.out.println("Pessoa Jurídica efetuou uma compra.");
    }
}
