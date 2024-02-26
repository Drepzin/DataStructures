package Testes;

public class OrganizacaoDeBolha {
	
	public static void main(String[] args) {
		
		int[] vetor = new int[10];
		
		for(int i=0; i<vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
			System.out.println(vetor[i]);
		}
		
		//bubble sort
		
		System.out.println("After bubbleSort: ");
		int temp;
		for(int i=0; i<vetor.length; i++) {
			for(int j=i+1; j<vetor.length; j++) {
				if(vetor[i] > vetor[j]) {
					temp = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = temp;
				}
			}
		}
		
		for(int i=0;i<vetor.length;i++) {
			System.out.println(vetor[i]);
		}
	}
}
