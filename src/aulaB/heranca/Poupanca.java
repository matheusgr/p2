package aulaB.heranca;

public class Poupanca extends Conta {

	public Poupanca(String cpf) {
		super(cpf);
	}

	@Override
	public void saca(int valor) {
		if (this.getValor() >= valor) {
			super.saca(valor);
		}
	}
	
}
