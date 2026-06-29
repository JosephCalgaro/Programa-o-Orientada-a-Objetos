package pkg;

import java.util.Scanner;

public class ex10_simulado {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do time: ");
        String nome = teclado.nextLine();
        System.out.println("Digite o número de gols marcados: ");
        int golsMarcados = teclado.nextInt();
        System.out.println("Digite o número de gols sofridos: ");
        int golsSofridos = teclado.nextInt();
        Time time = new Time(nome, golsMarcados, golsSofridos);

        System.out.println("Nome do time: " + time.getNome());
        System.out.println("Adicionando gols marcados...");
        time.marcarGol();
        System.out.println("Adicionando gols sofridos...");
        time.sofrerGol();
        System.out.println("Saldo de gols do time: " + time.calcularSaldoGols());
        System.out.println("Digite a quantidade de gols do time adversário: ");
        int golsAdversario = teclado.nextInt();
        System.out.println("Resultado da partida: " + time.resultadoPartida(golsAdversario));
    }
}
