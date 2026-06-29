package pkg;

public class Carro {
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;

    public Carro(String modelo, double velocidadeMaxima){
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0.0;
    }

    public boolean atingiuVelocidadeMaxima(){
        return this.velocidadeAtual >= this.velocidadeMaxima;
    }

    public void acelerar(double incremento){
        if(incremento > 0){
            this.velocidadeAtual += incremento;
            if(this.velocidadeAtual > this.velocidadeMaxima){
                this.velocidadeAtual = this.velocidadeMaxima;
                System.out.println("Velocidade máxima atingida!");
            }
        }
    }

    public void frear(double decremento){
        if(decremento > 0){
            this.velocidadeAtual -= decremento;
            if(this.velocidadeAtual < 0){
                this.velocidadeAtual = 0.0;
                System.out.println("O carro parou!");
            }
        }
    }

    public double calcularTempoViagem(double distancia){
        if(this.velocidadeAtual > 0){
            return distancia / this.velocidadeAtual;
        }else{
            System.out.println("O carro está parado. Não é possível calcular o tempo de viagem.");
            return 0;
        }
    }
}
