package pkg;

public class Retangulo {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(int base) {
        if (base < 0) {
            System.out.println("Base não pode ser negativa");
        }else {
            this.base = base;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if(altura<0){
            System.out.println("Altura não pode ser negativa");
        }else {
            this.altura = altura;
        }
    }

    public double calcularArea(){
        double area = this.base*this.altura;
        return area;
    }
}
