package pkg;

import java.util.Scanner;

public class ex8_revisao {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        Usuario usuario1 = new Usuario("admin", "1234");

        System.out.println("Informe o nome de usuario: ");
        String nomeDigitado = teclado.nextLine();
        System.out.println("Informe a senha: ");
        String senhaDigitada = teclado.nextLine();

        boolean sucesso = usuario1.login(nomeDigitado, senhaDigitada);

        if(sucesso){
            System.out.println("Login bem sucedido!");
            usuario1.exibirStatus();
    
            usuario1.logout();
            System.out.println("Apos logout: ");
            usuario1.exibirStatus();
        }else{
            System.out.println("Nome ou senha incorretos");
        }

    }

}
