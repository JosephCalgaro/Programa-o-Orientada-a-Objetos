package Relacionamento;

public class FuncionarioExercicio6 {

    protected String nome;
    protected double salario;

    public FuncionarioExercicio6(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // aumento padrão
    public void aumentarSalario(double porcentagem) {
        salario += salario * (porcentagem / 100);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nSalário: R$ " + salario;
    }
}