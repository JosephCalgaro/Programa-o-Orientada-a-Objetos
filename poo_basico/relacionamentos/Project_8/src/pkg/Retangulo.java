package pkg;

import java.lang.Math;

public class Retangulo {
    double altura;
    double largura;

    public Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularArea(){
        return this.altura * this.largura;
    }

    public double calcularPerimetro(){
        return 2 * (this.altura + this.largura);
    }

    public double calcularDiagonal(){
        return Math.sqrt(Math.pow(this.altura, 2) + Math.pow(this.largura, 2));
    }

    public boolean eQuadrado(){
        return this.altura == this.largura;
    }


}
