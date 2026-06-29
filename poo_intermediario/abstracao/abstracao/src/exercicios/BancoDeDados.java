package exercicios;

public class BancoDeDados implements AcessarDados{

    @Override
    public void conectar() {
        System.out.println("Conectado ao banco de dados.");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectado do banco de dados.");
    }

    @Override
    public void inserir() {
        System.out.println("Registro inserido com sucesso.");
    }

    @Override
    public void atualizar() {
        System.out.println("Registro atualizado com sucesso.");
    }

    @Override
    public void excluir() {
        System.out.println("Registro excluído com sucesso.");
    }
}
