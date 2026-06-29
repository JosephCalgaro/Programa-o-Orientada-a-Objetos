package pkg;

public class Filme {
    String titulo;
    int duracao;
    int classificacaoEtaria;

    public Filme(String titulo, int duracao, int classificacaoEtaria){
        this.titulo = titulo;
        this.duracao = duracao;
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public String converterDuracaoEmHoras(){
        int horas = this.duracao / 60;
        int minutos = this.duracao % 60;
        return horas + "h " + minutos + "min";
    }

    public boolean podeAssistir(int idade){
        return idade >= this.classificacaoEtaria;
    }

    public String descricaoFilme(){
        return "Título: " + this.titulo + ", Duração: " + this.converterDuracaoEmHoras() + ", Classificação Etária: " + this.classificacaoEtaria + "+";
    }
}
