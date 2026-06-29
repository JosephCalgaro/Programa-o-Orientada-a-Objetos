package Relacionamento;

public class Desenvolvedor extends FuncionarioExercicio6 {

    private int horasExtras;

    public Desenvolvedor(String nome,
                         double salario,
                         int horasExtras) {

        super(nome, salario);
        this.horasExtras = horasExtras;
    }

    @Override
    public String toString() {

        return "DESENVOLVEDOR" + "\nNome: " + nome + "\nSalário: R$ " + salario + "\nHoras extras: " + horasExtras;
    }
}