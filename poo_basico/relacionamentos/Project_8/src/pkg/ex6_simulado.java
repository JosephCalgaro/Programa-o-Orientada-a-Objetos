package pkg;

import java.util.Scanner;

public class ex6_simulado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();

        System.out.print("Digite a velocidade máxima do carro: ");
        double velocidadeMaxima = scanner.nextDouble();

        Carro carro = new Carro(modelo, velocidadeMaxima);

        System.out.print("Digite o incremento de velocidade: ");
        double incremento = scanner.nextDouble();
        carro.acelerar(incremento);

        System.out.print("Digite o decremento de velocidade: ");
        double decremento = scanner.nextDouble();
        carro.frear(decremento);

        System.out.print("Digite a distância da viagem: ");
        double distancia = scanner.nextDouble();
        double tempo = carro.calcularTempoViagem(distancia);

        System.out.println("Tempo de viagem: " + tempo + " horas.");
    }


}
