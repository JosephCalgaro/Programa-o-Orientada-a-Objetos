package pkg;

public class ex3_orientacaoObjetos {
    public static void main(String[] args) {
        //Endereco endereco = new Endereco("Rua A", 123, null);
        //Pessoa2 p1 = new Pessoa2("João", 30, endereco);
        Pessoa2 p1 = new Pessoa2("João", 30, new Endereco("Rua A", 123, null));

        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Endereco: " + p1.getEndereco()); //mesma coisa que getEndereco.toString()
        System.out.println("Rua: " + p1.getEndereco().getRua());
        System.out.println("Numero: " + p1.getEndereco().getNumero());
    }
}
