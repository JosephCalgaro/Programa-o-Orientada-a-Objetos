package pkg_1;

public class Retangulo extends Figura {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura, String cor, String preenchimento) {
        super(cor, preenchimento);
        this.largura = largura;
    }

    public void calcularArea(){
        double area = largura * altura;
        System.out.println("Area do retangulo: " + area);

    }
}
