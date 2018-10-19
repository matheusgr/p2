package r.b3.interfaces;
public class Poupanca extends Conta {

	public Poupanca(String cpf, int quantia) {
		super(cpf, quantia);
	}

	 public int sacar(int quantia) {
		this.quantia -= quantia;
		return quantia;
	}
	
	@Override
	public String getTipo() {
		return "Poupanca";
	}

	@Override
	public String getDetalhes() {
		return ".";
	}

	
	
}