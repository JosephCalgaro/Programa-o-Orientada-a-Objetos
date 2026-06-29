package Relacionamento;

public class Gerente extends Funcionario{
    private int bonus;


    public Gerente(String nome, String setor, double salario, int bonus) {
        super(nome, setor, salario);
        this.bonus = bonus;
    }

    @Override
    public void calcularSalario() {
        double salarioT = getSalario() + (getSalario() * (this.bonus * 0.01));
        System.out.println("Salário do gerente: " + salarioT);
    }
}
