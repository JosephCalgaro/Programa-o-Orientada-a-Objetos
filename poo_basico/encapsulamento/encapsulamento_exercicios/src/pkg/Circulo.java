package pkg;

public class Circulo {
    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float cacularArea(){
        float pi = 3.14159265f;
        float area = (float) (pi*(Math.pow(raio, 2)));
        return area;


    }
}
