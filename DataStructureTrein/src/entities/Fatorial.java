package entities;

public class Fatorial {
	//1-definir o numero do fatorial
	//2-
	
	public static int resultado(int n) {
		int sum = 1;
		int cont = n;
		while(cont > 1) {
			sum *= cont;
			cont--;
		}
		return sum;
	}
}
