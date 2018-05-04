package r.a4.classes_sortidas.pessoa;

public class Endereco {

	private String rua;
	private int numero;

	public Endereco(String rua, int numero) {
		this.rua = rua;
		this.numero = numero;
	}
	
	public String toString() {
		return this.rua + " - " + this.numero;
	}

	public void setNumero(int i) {
		this.numero = i;
	}

}
