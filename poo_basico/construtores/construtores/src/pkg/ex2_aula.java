package pkg;

public class ex2_aula {

    public static void main(String[] args){
    try{
    String numero = "abc";

    int valor = Integer.parseInt(numero);
    }catch(NumberFormatException e){
        System.out.println("Exceção de formato de numero: "+e.getMessage());
    }catch(Exception e){
        System.out.println("Exceção: "+e.toString());
    }
}
}
