package pkg;

public class ex2_orientacaoObjetos {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 2500.00);
        //Produto p2 = p1.clone();
        Produto p2 = p1.aponta();
        System.out.println("Produto 1: " + p1.getNome() + " - R$ " + p1.getPreco());
        System.out.println("Produto 2: " + p2.getNome() + " - R$ " + p2.getPreco());

        p2.setPreco(500.00);
        System.out.println("Produto 2 atualizado: " + p2.getNome() + " - R$ " + p2.getPreco());
        System.out.println("Produto 2 atualizado: " + p1.getNome() + " - R$ " + p1.getPreco());

    }
}
