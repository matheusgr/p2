package bb;

public interface ContaInterface extends Comparable<ContaInterface> {

	public void sacar(int valor);
	
	public void depositar(int valor);
	
	public int getValor();
	
}