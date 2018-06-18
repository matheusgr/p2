package r.b2.coisalinder;

public abstract class Conta {

	private String descr;
	private String nome;
	private int idade;
	protected int lindezas;
	
	public Conta(String descr, String nome, int idade) {
		this.descr = descr;
		this.nome = nome;
		this.idade = idade;
		this.lindezas = 0;
	}

	public void lindar() {
		this.lindezas++;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	@Override
	public String toString() {
		return this.getClass() + " [descr=" + descr + ", nome=" + nome + ", idade=" + idade + ", lindezas=" + lindezas + "]";
	}

	
	
}
