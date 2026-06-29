package Relacionamento;

public class Exercicio6 {
    public static void main(String[] args) {

        FuncionarioExercicio6[] funcionarios = new FuncionarioExercicio6[2];

        funcionarios[0] = new GerenteExercicio6("Carlos", 8000, 5000);

        funcionarios[1] = new Desenvolvedor("Ana", 4500, 20);

        // aumento padrão
        funcionarios[0].aumentarSalario(10);

        funcionarios[1].aumentarSalario(5);

        // usando sobrecarga do gerente
        GerenteExercicio6 gerente = (GerenteExercicio6) funcionarios[0];

        gerente.aumentarSalario(5, 2000);

        // imprimir informações
        for (FuncionarioExercicio6 f : funcionarios) {

            System.out.println("----------------");

            System.out.println(f);
        }
    }
}

