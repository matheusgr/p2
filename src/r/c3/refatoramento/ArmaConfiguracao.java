package r.c3.refatoramento;

public class ArmaConfiguracao {

	private String nome;
	private String arma;

	public ArmaConfiguracao(String nome, String arma) {
		this.nome = nome;
		this.arma = arma;
		if (arma == null) {
			this.arma = "TIRO";
		}
	}

	public Object getNome() {
		return nome;
	}

	public String getArma() {
		return arma;
	}
	
}
