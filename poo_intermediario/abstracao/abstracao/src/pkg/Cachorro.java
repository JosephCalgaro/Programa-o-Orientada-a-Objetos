package pkg;

public class Cachorro extends Animal {

    public Cachorro(String especie, int idade) {
        super(especie, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println("Au Au");
    }

    public void cuidarPatio(){
        System.out.println("Cuidando do patio");
    }
}
