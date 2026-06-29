package pkg;

public class ex3_class {

    public static void main(String[] args) {

        pessoa pessoa1 = new pessoa();

        pessoa1.nome = "João";
        pessoa1.idade = 25;
        pessoa1.genero = "Masculino";

        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);
        System.out.println("Gênero: " + pessoa1.genero);

    }
}