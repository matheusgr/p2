package aulaB.heranca;

public class Conta {

	private String cpf;
	private int valor;

	public Conta(String cpf) {
		this.cpf = cpf;
		this.valor = 0;
	}

	public void saca(int valor) {
		this.valor -= valor;
	}

	public void deposita(int valor) {
		this.valor += valor;
	}

	/*
	 * Pq getCPF? se o atributo cpf fosse publico qualquer pessoa
	 * de fora poderia alterar o cpf. Deixamos o atributo privado
	 * de forma que o valor seja acessível apenas através do getCPF.
	 */
	public String getCPF() {
		return cpf;
	}
	
	public int getValor() {
		return this.valor;
	}

	@Override
	public String toString() {
		return  "Conta... CPF (" + this.cpf + "): " + this.valor;
	}
	
}
