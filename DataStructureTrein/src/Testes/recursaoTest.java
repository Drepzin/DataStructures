package Testes;

public class recursaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vetor = new int[5];
		
		for(int i=0; i<vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length * 2);
			System.out.println(vetor[i]);
		}
		System.out.println();
		System.out.println("---------------");
		System.out.println();
		
		System.out.println(recursiveSum(0, vetor));
	}
	
	private static int recursiveSum(int pos, int[] vetor) {
		if(pos < vetor.length) {
			return vetor[pos] + recursiveSum(pos + 1, vetor);
		}
		else {
			return 0;
		}
	}
}
