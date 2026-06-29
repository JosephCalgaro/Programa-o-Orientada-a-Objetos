package interfaces;

public class Smartphone implements PC, Celular {
    String tel;
    String email;


    public Smartphone(String tel, String email) {
        super();
        this.tel = tel;
        this.email = email;
    }



    @Override
    public void realizarChamada() {
        System.out.println("Realizando chamada...");
    }

    @Override
    public void verificaEmail() {
        System.out.println("Verificando email...");
    }
}
