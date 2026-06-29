package exercicios;

public class Exercicio6 {
    public static void main(String[] args) {
        Gerente g = new Gerente("João", 5000.0);
        Vendedor v = new Vendedor("Maria", 3000.0);

        System.out.println("Salário do Gerente: " + g.calcularSalario());
        System.out.println("Salário do Vendedor: " + v.calcularSalario());
    }
}
