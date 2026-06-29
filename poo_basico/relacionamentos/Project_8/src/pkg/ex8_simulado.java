package pkg;

import java.util.Scanner;

public class ex8_simulado {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o título do filme: ");
        String titulo = teclado.nextLine();
        System.out.println("Digite a duração do filme (em minutos): ");
        int duracao = teclado.nextInt();
        System.out.println("Digite a classificação etária do filme: ");
        int classificacaoEtaria = teclado.nextInt();
        Filme filme = new Filme(titulo, duracao, classificacaoEtaria);

        System.out.println("Digite a idade do espectador: ");
        int idade = teclado.nextInt();
        if(filme.podeAssistir(idade)){
            System.out.println("O espectador pode assistir ao filme.");
        } else {
            System.out.println("O espectador não pode assistir ao filme.");
        }
        System.out.println(filme.descricaoFilme());

        teclado.close();
    }

}
