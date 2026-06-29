package pkg_2;

public class Funcionario extends Pessoa {

    public Funcionario(String nome) {
        super(nome);
    }

    @Override
    public void trabalhar() {
        System.out.println("O funcionário está trabalhando");
    }
}