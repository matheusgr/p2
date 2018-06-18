package r.a5.robos;

public class Arma {

	private int municao;
	private int cadencia;
	
	public Arma(int municao, int cadencia) {
		if (municao < 0) {
			throw new IllegalArgumentException("Municação negativa!");
		}
		if (cadencia <= 0) {
			throw new IllegalArgumentException("Cadencia nula ou negativa!");
		}
		this.municao = municao;
		this.cadencia = cadencia;
	}
	
	public int atira() {
		if (this.cadencia < this.municao) {
			this.municao -= this.cadencia;
			return this.cadencia;
		} else {
			int balasAtiradas = this.municao;
			this.municao -= balasAtiradas;
			return balasAtiradas;
		}
	}
	
}
