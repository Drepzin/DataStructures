package Testes;

public class OrdenacaoPorselecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vetor = new int[10];
		
		for(int i=1; i<vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length * 2);
			System.out.println(vetor[i]);
		}
		
		System.out.println();
		System.out.println("---------------");
		System.out.println();
		
		//nesse contexto i será a variavel a ser analisada então será uma busca linear
		for(int i=0; i<vetor.length; i++) {
			//j será os proximos elementos da lista que serão comparados com o elemento atual
			int menorValor = i;
			for(int j=i+1; j<vetor.length; j++) {
				//temp será a varivael temporaria que guardará o menor valor e o organizará
				if(vetor[menorValor] > vetor[j]) {
					menorValor = j;
				}
			}
			int temp = vetor[menorValor];
			vetor[menorValor] = vetor[i];
			vetor[i] = temp;
		}
		
		for(int i=0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
