package r.b3.interfaces.ingresso;

public class IngressoGeralzao {

	private String tipo;
	private int id;
	private String l;
	private int c;

	public IngressoGeralzao(int id) {
		this.tipo = "BASE";
		this.id = id;
	}
	
	public IngressoGeralzao(int id, String l, int c) {
		this.tipo = "CAMAROTE";
		this.id = id;
		this.l = l;
		this.c = c;
	}
	
	public String getId() {
		return this.tipo + this.id;
	}
	
	@Override
	public String toString() {
		if ("BASE".equals(this.tipo)) {
			return "BASEEE R$10" + id;
		}
		if ("CAMAROTE".equals(this.tipo)) {
			return "CAMAROTE E E R$50" + l + c + " " + id;
		}
		return null;
	}
	
}
