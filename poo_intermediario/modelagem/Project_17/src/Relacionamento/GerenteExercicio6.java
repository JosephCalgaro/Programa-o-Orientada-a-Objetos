package Relacionamento;

public class GerenteExercicio6 extends FuncionarioExercicio6 {

    private double bonusAnual;

    public GerenteExercicio6(String nome, double salario, double bonusAnual) {
        super(nome, salario);
        this.bonusAnual = bonusAnual;
    }

    // sobrecarga
    public void aumentarSalario(double porcentagem, double bonusExtra) {

        salario += salario * (porcentagem / 100);

        salario += bonusExtra;
    }

    @Override
    public String toString() {
        return "GERENTE" + "\nNome: " + nome + "\nSalário: R$ " + salario + "\nBônus anual: R$ " + bonusAnual;
    }
}