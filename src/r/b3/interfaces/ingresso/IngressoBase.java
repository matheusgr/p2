package r.b3.interfaces.ingresso;

public class IngressoBase extends IngressoAbstrato {

	public IngressoBase(int id) {
		super("BASE" + id);
	}

	@Override
	public String toString() {
		return "Ingresso Base R$10,00 " + this.getId();
	}
	
}
