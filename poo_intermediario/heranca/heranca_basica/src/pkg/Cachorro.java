package pkg;

public class Cachorro extends Animal {
    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void latir(){
        if(som.equals("late")) {
            System.out.println("O cachorro late");
        }
    }

    public void exibirMSG(){
        System.out.println("O nome do cachorro é:"+nome);
        System.out.println("A idade do cachorro é: "+idade );
        System.out.println("A raça do cachorro é: "+raca);
    }
}
