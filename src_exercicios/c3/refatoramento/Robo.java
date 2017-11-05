package c3.refatoramento;

public class Robo {

	private String arma;
	private int energia;
	private int[] municoes;
	private String apelido;

	public Robo(int i) {
		this.energia = i;
		this.municoes = new int[] {100, 10, 30};
		this.apelido = "3cpo";
	}

	public void armar(String string) {
		this.arma = string;
	}
	
	public String tiro() {
		if (this.energia == 0) {
			return "...";
		}
		this.energia -= 1;
		if (this.arma == null || "TIRO".equals(this.arma)) {
			if (this.municoes[0] == 0) {
				return "";
			} else {
				this.municoes[0] -= 1;
				return "PEW PEW PEW";
			}
		} else if ("BAZOOKA".equals(this.arma)) {
			if (this.municoes[1] == 0) {
				return "";
			} else {
				this.municoes[1] -= 1;
				return "BOOOM";
			}
		} else if ("SNIPER".equals(this.arma)) {
			if (this.municoes[2] == 0) {
				return "";
			} else {
				this.municoes[2] -= 1;
				return "PPPPPFFT";
			}
		}
		throw new IllegalArgumentException("Arma invalida");
	}

	@Override
	public String toString() {
		return this.apelido + " : " + this.energia;
	}
	
}
