package Relacionamento;

public class Notebook extends Computador{

    public Notebook(String marca, String modelo) {
        super(marca, modelo);
    }

    public void exibeMarca(String Marca) {
        System.out.println("Marca: " + Marca);
    }

    public static class Main{
        public static void main(String[] args) {
            Notebook notebook = new Notebook("Dell", "XPS 13");
            notebook.exibeMarca(notebook.getMarca());
            notebook.ExibeModelo(notebook.getModelo());
        }
    }
}
