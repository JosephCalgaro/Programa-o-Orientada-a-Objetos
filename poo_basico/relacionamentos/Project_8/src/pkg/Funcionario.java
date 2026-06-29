package pkg;

public class Funcionario {
    String nome;
    double salario;
    int horasExtras;

    public Funcionario(String nome, double salario, int horasExtras){
        this.nome = nome;
        this.salario = salario;
        this.horasExtras = horasExtras;
    }

    public double calcularHorasExtras(){
        return this.horasExtras * 50.0;
    }

    public double calcularSalarioTotal(){
        return this.salario + this.calcularHorasExtras();
    }

    public int adicionarHorasExtras(int horasExtras){
        this.horasExtras += horasExtras;
        return this.horasExtras;
    }


}
