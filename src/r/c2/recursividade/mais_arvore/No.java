package r.c2.recursividade.mais_arvore;

public class No<E extends Comparable<E>> {

	private No<E> maior;
	
	private No<E> menor;
	
	private E valor;
	
	public No(E valor) {
		this.valor = valor;
	}


	public int nivel(E i) {
		return nivel(i, 0);
	}
	
	private int nivel(E i, int nivel) {
		if (i.compareTo(this.valor) == 0) {
			return nivel;
		}
		if (i.compareTo(this.valor) > 0) {
			if (this.maior == null) {
				return -1;
			}
			return this.maior.nivel(i, nivel + 1);
		}
		if (i.compareTo(this.valor) < 0) {
			if (this.menor == null) {
				return -1;
			}
			return this.menor.nivel(i, nivel + 1);
		}
		throw new RuntimeException("?!?!?!");
	}

	
	public boolean contains(E i) {
		if (i.compareTo(this.valor) == 0) {
			return true;
		}
		if (i.compareTo(this.valor) > 0) {
			if (this.maior == null) {
				return false;
			}
			return this.maior.contains(i);
		}
		if (i.compareTo(this.valor) < 0) {
			if (this.menor == null) {
				return false;
			}
			return this.menor.contains(i);
		}
		throw new RuntimeException("?!?!?!");
	}
	
	public void add(E i) {
		if (i.compareTo(this.valor) == 0) {
			return;
		}
		if (i.compareTo(this.valor) > 0) {
			if (this.maior == null) {
				this.maior = new No<>(i);
				return;
			} else {
				this.maior.add(i);
			}
		}
		if (i.compareTo(this.valor) < 0) {
			if (this.menor == null) {
				this.menor = new No<>(i);
				return;
			} else {
				this.menor.add(i);
			}
		}
	}
	
	@Override
	public String toString() {
		String resultado = "";
		
		
		if (this.menor != null) {
			resultado += this.menor.toString();
		}
		
		resultado += " " + this.valor.toString() + " ";
		
		if (this.maior != null) {
			resultado += this.maior.toString();
		}
		
		return resultado;
	}
	
	public E minimo() { return null; }
	public E maximo() { return null; }
	public int contaMenores(E i) { return 0; }
	public String toString(int nivel) { return ""; }
	public String toStringReverso() { return ""; }
	public E pegarOrdenado(int nesimo) { return null; }
	public void remover(E elemento) {}
	
}