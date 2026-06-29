package pkg;

public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double nota3;

    public Aluno(String nome, double nota1, double nota2, double nota3){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia(){
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    public boolean aprovado(){
        return this.calcularMedia() >= 7.0;
    }

    public double maiorNota(){
        double maior = this.nota1;

        if(this.nota2 > maior){
            maior = this.nota2;
        }
        if(this.nota3 > maior){
            maior = this.nota3;
        }
        return maior;
    }

    public double menorNota(){
        double menor = this.nota1;

        if(this.nota2 < menor){
            menor = this.nota2;
        }
        if(this.nota3 < menor){
            menor = this.nota3;
        }
        return menor;
    }
}

