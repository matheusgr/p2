
package r.b2.coisalinder;

public class ContaPremium extends Conta {

	public ContaPremium(String nome, String descr, int idade) {
		super(nome, descr, idade);
	}
	
	@Override
	public void lindar() {
		this.lindezas += 2;
	}

}
