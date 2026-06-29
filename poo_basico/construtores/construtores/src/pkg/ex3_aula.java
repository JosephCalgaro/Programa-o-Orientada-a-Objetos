package pkg;

public class ex3_aula {

    public static void main(String[] args){
        try{
            int a = 10;
            int b = 0;

            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println("Exeção aritmetrica: "+e.getMessage());
        }catch(Exception e){
            System.out.println("Exceção: "+e.toString());
        }
    }
}
