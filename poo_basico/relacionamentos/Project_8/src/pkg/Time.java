package pkg;

public class Time {
    private String nome;
    private int golsMarcados;
    private int golsSofridos;

    public Time(String nome, int golsMarcados, int golsSofridos){
        this.nome = nome;
        this.golsMarcados = golsMarcados;
        this.golsSofridos = golsSofridos;
    }

    public int marcarGol(){
        this.golsMarcados++;
        return this.golsMarcados;
    }

    public int sofrerGol(){
        this.golsSofridos++;
        return this.golsSofridos;
    }

    public int calcularSaldoGols(){
        return this.golsMarcados - this.golsSofridos;
    }

    public String getNome(){
        return this.nome;
    }

    public int getGolsMarcados() {
        return this.golsMarcados;
    }

    public int getGolsSofridos() {
        return this.golsSofridos;
    }

    public String resultadoPartida(int golsMarcadosAdversario){
        if(this.golsMarcados > golsMarcadosAdversario){
            return "Vitória";
        }else if(this.golsMarcados < golsMarcadosAdversario){
            return "Derrota";
        }else{
            return "Empate";
        }
    }
}
