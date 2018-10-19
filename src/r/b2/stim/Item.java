package r.b2.stim;

public class Item {

	private String id;
	private int valor;

	public Item(String id, int valor) {
		this.id = id;
		this.valor = valor;
	}

	public int getValor() {
		return this.valor;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", valor=" + valor + "]";
	}

	
	
}
