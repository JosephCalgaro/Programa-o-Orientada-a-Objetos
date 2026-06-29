package exercicios;

public class Exercicio5 {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("João", "São Paulo", "123.456.789-00", "28530950069");
        PessoaJuridica pj = new PessoaJuridica("Empresa XYZ", "Rio de Janeiro", "12.345.678/0001-00");

        pf.efetuarCompra();
        pj.efetuarCompra();

    }
}
