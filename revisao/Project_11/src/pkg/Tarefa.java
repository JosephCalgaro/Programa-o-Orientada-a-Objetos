package pkg;

public class Tarefa {
    String descricao;
    boolean concluida;

    public Tarefa(String descricao){
        this.descricao = descricao;
        this.concluida = false;
    }

    public void concluirTarefa(){
        this.concluida = true;
    }

    public void exibirTarefa(){
        System.out.println("Descrição da tarefa: "+this.descricao);
        System.out.println("concluida? "+this.concluida);
    }

}
