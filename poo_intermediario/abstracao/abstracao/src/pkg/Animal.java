package pkg;

abstract class Animal {

    private String especie;
    private int idade;

    public Animal(String especie, int idade) {
        this.especie = especie;
        this.idade = idade;
    }

    public void emitirSom(){
        System.out.println("Emitiendo som");
    }

    public void exibirInfo(){
        System.out.println("Especie: " + this.especie);
        System.out.println("Idade: " + this.idade);
    }
}
