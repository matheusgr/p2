package aulaB.heranca;

public abstract class Conta {

	private String cpf;
	protected int valor;

	public Conta(String cpf, int valorInicial) {
		if (cpf == null || cpf.equals("")) {
			throw new StringInvalidoException("Conta vazia invalida", valorInicial);
		}
		this.cpf = cpf;
		this.valor = 1000;
	}

	public abstract void saca(int valor);

	public void deposita(int valor) {
		this.valor += valor;
	}

	public String getCPF() {
		return cpf;
	}

	public int getValor() {
		return this.valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {

		return "Conta... CPF (" + this.cpf + "): " + this.valor;
	}

}
