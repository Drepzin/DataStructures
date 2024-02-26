package Testes;

public class OrdenacaoPorInsercao {

	public static void main(String[] args) {
		
		int[] vetor = new int[10];
		
		for(int i=0; i<vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length * 2);
			System.out.println(vetor[i]);
		}
		System.out.println();
		System.out.println("-------------------");
		System.out.println();
		
		for(int i=1; i<vetor.length; i++) {
			int atual = vetor[i];
			int anterior = i -1;
			while(anterior >= 0 && vetor[anterior] > atual) {
				vetor[anterior + 1] = vetor[anterior];
				vetor[anterior] = atual;
				anterior--;
			}
			vetor[anterior + 1] = atual;
		}
		
		for(int i=0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
	}
	
}
