package interfaces;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Rex";
        cachorro.raca = "Labrador";
        cachorro.idade = 5;

        System.out.println("Informações do Cachorro:");
        cachorro.exibirInfo();
        System.out.print("Som do Cachorro: ");
        cachorro.emitirSom();


    }
}
