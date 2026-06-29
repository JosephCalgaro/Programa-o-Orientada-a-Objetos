package pkg;

public class ex1_orientacaoObjetos {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("João", 30);

        exibeDadosPessoa(p);
    }

    /*Metodo static trata-se de um métod que pertence a classe e não a um objeto específico.
    // Ele pode ser chamado sem criar uma instância da classe.
    // No exemplo, o métod exibeDadosPessoa é declarado como static, o que significa que ele pode ser chamado
     diretamente usando o nome da classe, sem a necessidade de criar um objeto da classe Pessoa.*/
    public static void exibeDadosPessoa(Pessoa p){
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
    }
}
