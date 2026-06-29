package pkg;

import java.util.Scanner;

public class ex10_revisao {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Tarefa[] tarefas = new Tarefa[3];

        // Entrada de dados
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a descrição da tarefa " + (i + 1) + ":");
            String descricao = teclado.nextLine();

            tarefas[i] = new Tarefa(descricao);
        }

    
        tarefas[0].concluirTarefa();

        for (int i = 0; i < 3; i++) {
            tarefas[i].exibirTarefa();
        }
    }
}