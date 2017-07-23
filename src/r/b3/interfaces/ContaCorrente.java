package r.b3.interfaces;

public class ContaCorrente extends Conta {

	private int chqEspecial;

	public ContaCorrente(String cpf, int chqEspecial, int quantia) {
		super(cpf, quantia);
		this.chqEspecial = chqEspecial;
	}

	@Override
	public int sacar(int quantia) {
		if (this.getSaldo() + this.chqEspecial - quantia >= 0) {
			this.setQuantia(quantia);
		}
		throw new IllegalArgumentException("Conta sem fundos");
	}

	public int getChqEspecial() {
		return this.chqEspecial;
	}

	@Override
	public String getTipo() {
		return "CC";
	}

	@Override
	public String getDetalhes() {
		return "" + this.chqEspecial;
	}
	
	
}
