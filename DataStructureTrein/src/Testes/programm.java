package Testes;

import entities.Fatorial;
import entities.ListaLinkada;
import entities.segundoMaiorValor;

public class programm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaLinkada<Integer> ll = new ListaLinkada<Integer>();
		ll.adicionar(1);
		ll.adicionar(4);
		ll.adicionar(5);
		ll.adicionar(12);
		System.out.println(ll.get(2));
	}
}