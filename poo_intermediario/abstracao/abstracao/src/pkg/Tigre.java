package pkg;

public class Tigre extends Animal{

    public Tigre(String especie, int idade) {
        super(especie, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Grrr Grrr");
    }
}
