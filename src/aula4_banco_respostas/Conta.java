package aula4_banco_respostas;

public class Conta {

	private String cpf;
	private int valor;
	private boolean especial;

	public Conta(String cpf, boolean especial) {
		this.cpf = cpf;
		this.valor = 0;
		this.especial = especial;
	}

	public void saca(int valor) {
		this.valor -= valor;
	}

	public void deposita(int valor) {
		if (especial) {
			this.valor += (valor * 0.001);
		}
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

	@Override
	public String toString() {
		return  "CPF (" + this.cpf + "): " + this.valor;
	}
	
}
