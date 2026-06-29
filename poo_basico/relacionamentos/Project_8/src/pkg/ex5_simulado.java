package pkg;

import java.util.Scanner;

public class ex5_simulado {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário: ");
        String nome = teclado.nextLine();
        System.out.println("Digite o salário do funcionário: ");
        double salario = teclado.nextDouble();
        System.out.println("Digite as horas extras do funcionário: ");
        int horasExtras = teclado.nextInt();
        Funcionario funcionario = new Funcionario(nome, salario, horasExtras);

        System.out.println("Salário total do funcionário: " + funcionario.calcularSalarioTotal());
        System.out.println("Adicionando horas extras...");
        int horasExtrasAdicionar = teclado.nextInt();
        funcionario.adicionarHorasExtras(horasExtrasAdicionar);
        System.out.println("Novo salário total do funcionário: " + funcionario.calcularSalarioTotal());

        teclado.close();
    }

}
