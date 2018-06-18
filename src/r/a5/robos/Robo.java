package r.a5.robos;

public class Robo {

	private String nome;
	private Arma arma;
	
	public Robo(String nome, int municao, int cadencia) {
		this.nome = nome;
		this.arma = new Arma(municao, cadencia);
	}
	
	public int atira() {
		return this.arma.atira();
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (!o.getClass().equals(this.getClass())) {
			return false; 
		}
		Robo outroRobo = (Robo) o;
		return outroRobo.nome.equals(this.nome);
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
	
}
