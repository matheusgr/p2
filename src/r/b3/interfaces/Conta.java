package r.b3.interfaces;

public abstract class Conta implements Contabil {

	private String cpf;
	
	protected int quantia;
	
	public final static String NOVA_LINHA = System.lineSeparator();

	public Conta(String cpf, int quantia) {
		this.cpf = cpf;
		this.quantia = quantia;
	}

	protected void setQuantia(int quantia) {
		this.quantia -= quantia;
	}
	
	/* (non-Javadoc)
	 * @see Contabil#sacar(int)
	 */
	public abstract int sacar(int quantia);

	/* (non-Javadoc)
	 * @see Contabil#depositar(int)
	 */
	public void depositar(int quantia) {
		this.quantia += quantia;
	}

	public int getSaldo() {
		return quantia;
	}
	
	public String toString() {
		return this.cpf + " - " + quantia + " centavos.";
	}
	
	public String reprBancaria() {
		return this.getTipo() + " - " + this.quantia + " - " + this.getDetalhes();
	}

	public abstract String getTipo();
	
	public abstract String getDetalhes();

	public static String codigo() {
		return "C";
	}
	
}
