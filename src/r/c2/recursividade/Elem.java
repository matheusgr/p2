package r.c2.recursividade;

public class Elem<T> {

	private T v;

	private Elem<T> prox;

	public Elem(T v) {
		this.v = v;
	}

	public void addV(T v) {
		if (this.prox == null) {
			this.prox = new Elem<T>(v);
		} else {
			this.prox.addV(v);
		}
	}

	@Override
	public String toString() {
		return "[" + toStringRecursivo() + "]";
	}

	private String toStringRecursivo() {
		if (this.prox == null) {
			return this.v.toString();
		}
		return this.v + ", " + this.prox.toStringRecursivo();
	}

	public int size() {
		if (this.prox == null) {
			return 1;
		}
		return 1 + this.prox.size();
	}

	public boolean contains(String v) {
		if (this.v.equals(v)) {
			return true;
		}
		if (this.prox == null) {
			return false;
		}
		return this.prox.contains(v);
	}

	public int indexOf(String v) {
		if (this.v.equals(v)) {
			return 0;
		}
		if (this.prox == null) {
			return -1;
		}
		int resposta = this.prox.indexOf(v);
		if (resposta == -1) {
			return -1;
		}
		return 1 + resposta;
	}

	public T get(int index) {
		if (index == 0) {
			return this.v;
		}
		if (this.prox == null) {
			throw new IndexOutOfBoundsException();
		}
		return this.prox.get(index - 1);
	}

	public T remove(int index) {
		if (this.prox == null) {
			throw new IndexOutOfBoundsException();
		}
		if (index == 1) {
			T tmp = this.prox.v;
			this.prox = this.prox.prox;
			return tmp;
		}
		return this.prox.remove(index - 1);
	}

	public void addOrdenado(String valor) {

	}

	public int indexOf(String v, int pos) {
		if (this.v.equals(v)) {
			return pos;
		}
		if (this.prox == null) {
			return -1;
		}
		return this.prox.indexOf(v, pos + 1);
	}

}
