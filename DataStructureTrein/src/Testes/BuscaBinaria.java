package Testes;

import java.util.Scanner;

public class BuscaBinaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor = new int[100];
		
		for(int i=0; i<vetor.length; i++) {
			vetor[i] = i;
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual numero deve ser procurado:");
		int pr = sc.nextInt();
		
		int contador = 0;
		boolean cond = false;
		int inicio = 0;
		int fim = vetor.length -1;
		int meio;
		while(inicio <= fim) {
			meio = (((int) inicio + fim) /2);
			if(vetor[meio] == pr) {
				cond = true;
				break;
			}
			else if(vetor[meio] > pr) {
				fim = meio - 1;
			}
			else {
				inicio = meio + 1;
			}
			contador++;
		}
		if(cond == true) {
			System.out.println("numero econtrado!");
			System.out.println(contador);
		}
		else {
			System.out.println("Numero não encontrado");
			System.out.println(contador);
		}
		sc.close();
	}

}
