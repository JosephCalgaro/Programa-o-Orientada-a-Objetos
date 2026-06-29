package interfaces;

public class Cachorro  implements Animal {

    public String nome;
    public String raca;
    public int idade;

    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Raça: " + this.raca);
        System.out.println("Idade: " + this.idade);
    }
}
