package entities;
//caracteristicas basicas de uma lista encadeada
//o que ela conhece?(atributos), seu tamanho, seu primeiro e ultimo nodo apenas

public class ListaLinkada<T>{
	
	private Nodo<T> primeiro;
	private Nodo<T> ultimo;
	private int tamanho;
	
	public ListaLinkada() {
		this.tamanho = 0;
	}

	public Nodo<T> getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Nodo<T> primeiro) {
		this.primeiro = primeiro;
	}

	public Nodo<T> getUltimo() {
		return ultimo;
	}

	public void setUltimo(Nodo<T> ultimo) {
		this.ultimo = ultimo;
	}

	public int getTamanho() {
		return tamanho;
	}
	
	public T get(int pos){
		Nodo<T> atual = this.primeiro;
		for(int i=0; i<pos; i++) {
			if(atual.getProximo() != null) {
				atual = atual.getProximo();
			}
		}
		return atual.getValor();
	}
	
	public void adicionar(T value) {
		Nodo<T> novo = new Nodo<T>(value);
		if (this.primeiro == null && this.ultimo == null) {
			this.primeiro = novo;
			this.ultimo = novo;
		}
		else {
			this.ultimo.setProximo(novo);
			this.ultimo = novo;
		}
		this.tamanho++;
	}
	
	public void remover(T value) {
		Nodo<T> atual = this.primeiro;
		Nodo<T> anterior = null;
		for(int i=0; i<this.tamanho; i++) {
			if(atual.getValor().equals(value)) {
				if(atual == this.primeiro) {
					this.primeiro = atual.getProximo();
					break;
				}
				else if (atual == this.ultimo) {
					this.ultimo = anterior;
					break;
				}
				else {
					anterior.setProximo(atual.getProximo());
					break;
				}
			}
			anterior = atual;
			atual = atual.getProximo();
		}
		this.tamanho--;
	}
	
	public ListaLinkadaIterator<T> Iteracao(Nodo<T> nodo){
		return new ListaLinkadaIterator<T>(this.primeiro);
	}

	
}
