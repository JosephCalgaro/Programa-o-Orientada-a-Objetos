package Relacionamento;

public class Exercicio1 {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("Dell", "XPS 13");
        notebook.exibeMarca(notebook.getMarca());
        notebook.ExibeModelo(notebook.getModelo());

        Netbook netbook = new Netbook("HP", "Pavilion");
        netbook.ExibeMarca(netbook.getMarca());
        netbook.ExibeModelo(netbook.getModelo());
    }
}
