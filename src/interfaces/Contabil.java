package interfaces;

public interface Contabil extends Comparable<Contabil> {

	public int sacar(int quantia);

	public void depositar(int quantia);
	
	public int getSaldo();
	
	public String reprBancaria();
	
	public default void sacarEDepositar(int valorSaque, int valorDeposito) {
		this.sacar(valorSaque);
		this.depositar(valorDeposito);
	}

	@Override
	public default int compareTo(Contabil o) {
		return this.getSaldo() - o.getSaldo();
	}

	
}