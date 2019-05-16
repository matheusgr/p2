package bb;

public class ContaCorrente implements ContaInterface {

	private String cpf;
	private int valor;
	private int limite;

	public ContaCorrente(String cpf, int limite) {
		this.cpf = cpf;
		this.valor = 0;
		this.limite = limite;
	}

	public void sacar(int valor) {
		if (this.valor - valor < -this.limite) {
			throw new IllegalArgumentException("conta lisa");
		}
		this.valor -= valor;
	}

	public void depositar(int valor) {
		this.valor += valor;
	}

	@Override
	public String toString() {
		return "ContaCorrente [cpf=" + cpf + ", valor=" + valor + ", limite=" + limite + "]";
	}

	
	
	@Override
	public int compareTo(ContaInterface o) {
		return this.getValor() - o.getValor();
	}

	@Override
	public int getValor() {
		return this.valor;
	}

	
	
}
