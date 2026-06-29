package pkg;

public class ex1_aula {

    public static void main(String[] args){
        try{
        int[] numeros = {1,2, 3};

        System.out.println(numeros[3]);

        int teste = 3;
        System.out.println(teste);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: indice fora do array \n"+e.getMessage());
        } catch (Exception e) {
            System.out.println("Exceção: "+e.toString());
        }
    }

}
