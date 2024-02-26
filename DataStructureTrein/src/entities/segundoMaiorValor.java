package entities;

public class segundoMaiorValor {
	
	public static int segundoValor(int[] l) {
		Integer maior = l[0];
		Integer segundo = null;
		for (int i=0; i<l.length; i++) {
			if(l.length < 2) {
				System.out.println("lista menor que 2");
			}
			else if(maior < l[i]){
				segundo = maior;
				maior = l[i];
			}
		}
		return segundo;
	}
}
