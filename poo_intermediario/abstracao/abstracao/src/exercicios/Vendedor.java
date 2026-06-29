package exercicios;

public class Vendedor extends Funcionario {


    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        return salario + (salario * 0.10);
    }
}
