package pkg;

public class Filme {
    String titulo;
    String diretor;
    int duracaoEmMinutos;
    String genero;

    public Filme(String titulo, String diretor, int duracaoEmMinutos, String genero){
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.genero = genero;
    }

    public boolean ehLongo(){
        if(this.duracaoEmMinutos >= 120){
            System.out.println("Filme é longo");
            return true;
        }
        return false;
    }

    public void exibirDetalhes(){
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Diretor: "+this.diretor);
        System.out.println("Duracao em minutos: "+this.duracaoEmMinutos);
        System.out.println("genero: "+this.genero);
    }

}
