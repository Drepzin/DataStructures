package entities;

public class ListaLinkadaIterator <T>{
	private Nodo<T> nodo;
	
	public ListaLinkadaIterator(Nodo<T> nodo) {
		this.nodo = nodo;
	}
	
	public boolean haveNode() {
		if(nodo.getProximo() == null) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public Nodo<T> getNext(){
		nodo = nodo.getProximo();
		return nodo;
	}
}
