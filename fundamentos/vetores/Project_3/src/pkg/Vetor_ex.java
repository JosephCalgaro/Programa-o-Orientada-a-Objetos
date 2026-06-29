package pkg;

public class Vetor_ex {

	public static void main(String[] args) {
		int[] vetor = new int[5];
		vetor[0] = 5;
		vetor[1] = 10;
		vetor[2] = 15;
		vetor[3] = 20;
		vetor[4] = 25;

		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Numero na posição "+i+" do vetor é "+vetor[i]);
		}
	}

}
