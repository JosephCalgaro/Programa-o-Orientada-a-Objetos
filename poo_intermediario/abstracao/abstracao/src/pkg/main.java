package pkg;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int op;
        Scanner sc = new Scanner(System.in);
        Cachorro cachorro = new Cachorro("Canis lupus familiaris", 5);
        Tigre tigre = new Tigre("Panthera leo", 10);

        cachorro.emitirSom();
        tigre.emitirSom();
        op = sc.nextInt();
        System.out.println("Digite 1 para novo cachoorro, 2 para novo tigre");
        if(op==1){
            Cachorro novoCachorro = new Cachorro("teste", 2);
            novoCachorro.emitirSom();
            novoCachorro.exibirInfo();
        } else if(op==2){
            Tigre novoTigre = new Tigre("teste", 10);
            novoTigre.emitirSom();
            novoTigre.exibirInfo();
        }

        cachorro.cuidarPatio();


    }
}
