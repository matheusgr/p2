package aulaD.recursividade.linkedlist;

public class Elemento {

	private int valor;
	private Elemento prox;

	public Elemento(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void add(Elemento e) {
		if (this.prox == null) {
			this.prox = e;
		} else {
			if (e.valor < this.prox.valor) {
				e.prox = this.prox;
				this.prox = e;
			} else {
				this.prox.add(e);
			}
		}
	}
	
	public String toString() {
		if (this.prox == null) {
			return this.valor + "";
		} else {
			return this.valor + ", " + this.prox.toString();
		}
	}

	public static void main(String[] args) {
		Elemento e = new Elemento(0);
		e.add(new Elemento(10));
		e.add(new Elemento(5));
		e.add(new Elemento(8));
		e.add(new Elemento(2));
		e.add(new Elemento(10));
		System.out.println(e);
		
	}

}
