package bb;

public class Poupanca implements ContaInterface {

	@Override
	public String toString() {
		return "Poupanca [cpf=" + cpf + ", valor=" + valor + "]";
	}

	private String cpf;
	private int valor;

	public Poupanca(String cpf) {
		this.cpf = cpf;
		this.valor = 0;
	}

	public void sacar(int valor) {
		if (this.valor - valor < 0) {
			throw new IllegalArgumentException("conta lisa");
		}
		this.valor -= valor;
	}

	public void depositar(int valor) {
		this.valor += valor;
	}

	@Override
	public int compareTo(ContaInterface o) {
		return this.toString().compareTo(o.toString());
	}

	@Override
	public int getValor() {
		return this.valor;
	}

}
