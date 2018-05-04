package r.a5.restaurante;

public class Refeicao {

	private String codigo;
	private double valor;
	private int numPessoas;
	private String descr;

	public Refeicao(String codigo, double valor, int numPessoas, String descr) {
		if (valor < 0) {
			throw new RuntimeException("VALOR INVALIDO");
		}
		if (descr == null || descr.equals("")) {
			throw new RuntimeException("DESCR NULA OU VAZIA");
		}
		this.codigo = codigo;
		this.valor = valor;
		this.numPessoas = numPessoas;
		this.descr = descr;
	}

	@Override
	public String toString() {
		return "Refeicao [codigo=" + codigo + ", valor=" + valor + ", numPessoas=" + numPessoas + ", descr=" + descr
				+ "]";
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
