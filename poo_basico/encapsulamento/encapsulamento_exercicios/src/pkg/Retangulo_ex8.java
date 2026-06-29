package pkg;

public class Retangulo_ex8 {
    private int x;
    private int y;

    public Retangulo_ex8(int a, int b) {
        this.x = a;
        this.y = b;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void inserir_lados(int a, int b) {
        this.x = a;
        this.y = b;
        System.out.println("Lados inseridos: x = " + this.x + ", y = " + this.y);
    }

    public void calcular_area() {
        int area = this.x * this.y;
        System.out.println("Area do retangulo: " + area);
    }
}
