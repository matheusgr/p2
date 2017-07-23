package r.b2.heranca;

public class Poupanca extends Conta {

	public Poupanca(String cpf, int valor) {
		super(cpf, valor);
	}

	public void saca(int valor) {
		if (this.valor >= 0) {
			this.valor -= valor;
		}
	}

}
