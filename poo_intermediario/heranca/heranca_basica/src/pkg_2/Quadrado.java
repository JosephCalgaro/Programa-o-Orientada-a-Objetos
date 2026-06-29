package pkg_2;

public class Quadrado extends Desenho2D{
    protected String desc;


    public Quadrado(int largura, int altura, String desc, String nomeAutor) {
        super(largura, altura, nomeAutor);
        this.desc = desc;
    }

    public void exibirDados(){
        System.out.println("Quadrado com o largura: " + this.largura);
        System.out.println("Quadrado com o altura: " + this.altura);
        System.out.println("Quadrado com o descricao: " + this.desc);
        System.out.println("Autor: " + this.nomeAutor);
    }
}
