package pkg_1;

public class Figura {
    protected String cor;
    protected String preenchimento;

    public Figura(String cor, String preenchimento) {
        this.cor = cor;
        this.preenchimento = preenchimento;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
}
