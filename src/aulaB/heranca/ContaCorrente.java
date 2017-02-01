package aulaB.heranca;

public class ContaCorrente extends Conta {

	private int chEspecial;

	public ContaCorrente(String cpf, int chEspecial) {
		super(cpf);
		this.chEspecial = chEspecial;
	}

	@Override
	public void saca(int valor) {
		if (this.getValor() + this.chEspecial >= valor) {
			super.saca(valor);
		}
	}

}
