package r.b2.stim;

public class Compra {

	private Item item;
	private int valor;

	public Compra(Item i, int valor, double desconto) {
		this.item = i;
		this.valor = (int) (valor * (1 + desconto));
	}

}
