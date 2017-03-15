package aulaB.heranca;

public class ContaCorrente extends Conta {

	private int chEspecial;

	public ContaCorrente(String cpf, int valor, int chEspecial) {
		super(cpf, valor);
		this.chEspecial = chEspecial;
	}

	public int getChEspecial() {
		return chEspecial;
	}

	@Override
	public void saca(int valor) {
		if (this.valor + this.chEspecial >= valor) {
			this.valor -= valor;
		}
	}

}
