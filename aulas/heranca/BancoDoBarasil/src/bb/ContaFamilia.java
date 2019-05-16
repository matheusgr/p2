package bb;

public class ContaFamilia implements ContaInterface {

	private String cpf;
	private ContaInterface conta1;
	private ContaInterface conta2;

	public ContaFamilia(String cpf, ContaInterface conta1, ContaInterface conta2) {
		this.cpf = cpf;
		this.conta1 = conta1;
		this.conta2 = conta2;
	}

	@Override
	public void sacar(int valor) {
		int valor1 = Math.floorDiv(valor, 2);
		int valor2 = (int) Math.ceil(valor / 2);
		this.conta1.sacar(valor1);
		this.conta2.sacar(valor2);
	}

	@Override
	public void depositar(int valor) {
		int valor1 = Math.floorDiv(valor, 2);
		int valor2 = (int) Math.ceil(valor / 2);
		this.conta1.depositar(valor1);
		this.conta2.depositar(valor2);
	}

	@Override
	public String toString() {
		return "ContaFamilia [cpf=" + cpf + ", conta1=" + conta1 + ", conta2=" + conta2 + "]";
	}

	@Override
	public int compareTo(ContaInterface o) {
		return this.toString().compareTo(o.toString());
	}

	@Override
	public int getValor() {
		return this.conta1.getValor() + this.conta2.getValor();
	}
	
}
