package r.b3.interfaces.banco;

public class ContaFamilia implements Contabil {

	private Contabil c1;
	private Contabil c2;

	public ContaFamilia(Contabil c1, Contabil c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	@Override
	public int sacar(int quantia) {
		int valorSacado = 0;
		valorSacado += c1.sacar(quantia / 2);
		valorSacado += c2.sacar(quantia - (int) (quantia / 2));
		return valorSacado;
	}

	@Override
	public void depositar(int quantia) {
		c1.depositar(quantia / 2);
		c2.depositar(quantia - (int) (quantia / 2));
	}

	@Override
	public String reprBancaria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSaldo() {
		return c1.getSaldo() + c2.getSaldo();
	}

}
