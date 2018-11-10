package r.b3.interfaces.ingresso;

public class IngressoCamarote extends IngressoAbstrato {

	private String localizacao;
	private int cabine;

	public IngressoCamarote(int id, String localizacao, int cabine) {
		super("CAMAROTE" + id);
		this.localizacao = localizacao;
		this.cabine = cabine;
	}

	@Override
	public String toString() {
		return "Ingresso Camarote " + this.localizacao + " " + this.cabine + " " + this.getPreco() + " " + this.getId();
	}

	private String getPreco() {
		if ("Superior".equals(this.localizacao)) {
			return "R$ 50,00";
		}
		if ("Inferior".equals(this.localizacao)) {
			return "R$ 40,00";
		}
		return null;
	}
	
}
