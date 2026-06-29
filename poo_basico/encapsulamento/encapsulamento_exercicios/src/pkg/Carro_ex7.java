package pkg;

public class Carro_ex7 {
    private String placa;
    private int numChassi;

    public Carro_ex7(String placa, int numChassi) {
        this.placa = placa;
        this.numChassi = numChassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }

    public void acelerar() {
        System.out.println("Carro acelerou");
    }

    public boolean frear() {
        System.out.println("Carro freou");
        return true;
    }
}
