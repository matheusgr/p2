package r.b2.coisalinder;

public class ContaComum extends Conta {

	public ContaComum(String nome, String descr, int idade) {
		super(nome, descr, idade);
		validaDescr(descr);
	}

	private void validaDescr(String descr) {
		if (descr.length() > 140) {
			throw new IllegalArgumentException("PAGUE!!!");
		}
	}
	
	@Override
	public void setDescr(String descr) {
		validaDescr(descr);
		super.setDescr(descr);
	}

}
