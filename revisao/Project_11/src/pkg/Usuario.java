package pkg;

public class Usuario {
    String nomeUsuario;
    String senha;
    boolean logado;

    public Usuario (String nomeUsuario, String senha){
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.logado = false;
    }

    public boolean login(String usuario, String senha) {
        if (usuario.equals(this.nomeUsuario) && senha.equals(this.senha)) {
            this.logado = true;
            return true;
        }
        return false;
    }

    public void logout(){
         this.logado = false;
    }

    public void exibirStatus(){
        if(!this.logado){
            System.out.println("Voce não esta logado");
            return;
        }
        System.out.println("Voce esta logado");
        System.out.println("Nome de Usuario: "+this.nomeUsuario);
    }

}
