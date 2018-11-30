package r.c2.recursividade.lista_com_generics;

import java.util.HashSet;

public class MinhaLista<T extends Comparable<T>> {

	private T nome;
	
	private MinhaLista<T> prox;
	
	public MinhaLista(T nome) {
		this.nome = nome;
	}
	
	public void extend(MinhaLista<T> p1) {
		this.prox = p1;
	}

	@Override
	public String toString() {
		if (this.prox == null) {
			return this.nome.toString();
		}
		return this.nome + " d__b " + this.prox.toString();
	}

	public void add(T string) {
		MinhaLista<T> ml = new MinhaLista<>(string);
		if (this.prox == null) {
			this.prox = ml;
			return;
		}
		this.prox.add(string);
	}
	
	public int tamanho() { 
		if (this.prox == null) {
			return 1;
		}
		return 1 + this.prox.tamanho();
	}
	
	
	public String toStringReverso() { 
		if (this.prox == null) {
			return this.nome.toString();
		}
		return this.prox.toStringReverso() + " " + this.nome;
		
	}
	/* insira antes de um elemento que seja maior (lexicog)*/
	public void addOrdenado(T ord) { 
		if (ord.compareTo(this.nome) > 0 && this.prox == null) {
			this.prox = new MinhaLista<>(ord);
			return;
		} 
		if (ord.compareTo(this.nome) <= 0) {
			MinhaLista<T> tmp = new MinhaLista<>(this.nome);
			tmp.prox = this.prox;
			this.nome = ord;
			this.prox = tmp;
			return;
		}
		if (ord.compareTo(this.nome) > 0) {
			this.prox.addOrdenado(ord);
		}
		
	}
	public int contaUnicas() {
		return contaUnicasAgoraVai(new HashSet<T>());
	}
	
	
	
	private int contaUnicasAgoraVai(HashSet<T> hashSet) {
		hashSet.add(this.nome);
		if (this.prox == null) {
			return hashSet.size();
		}
		return this.prox.contaUnicasAgoraVai(hashSet);
	}

	public boolean contains(String valor) {
		if (this.nome.equals(valor)) {
			return true;
		}
		if (this.prox == null) {
			return false;
		}
		return this.prox.contains(valor);
	}
	public T getPosicao(int i) {
		if (i == 0) {
			return this.nome;			
		}
		if (i > 0 && this.prox == null) {
			throw new IndexOutOfBoundsException("Ops..");
		}
		return this.prox.getPosicao(i - 1);
	}
	/* plus-plus */
	public void add(int pos, String valor) { }
	public void remove(String valor) { }
	

	
}