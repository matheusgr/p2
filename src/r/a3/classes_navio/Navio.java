package r.a3.classes_navio;

import r.a3.classes_navio.Navio;

public class Navio {
	
	private int vida;
	private int poderDeFogo;
	
	public Navio(int vida, int poderDeFogo) {
		this.vida = vida;
		this.poderDeFogo = poderDeFogo;
	}
	
	public Navio(int vida) {
		this.vida = vida;
		this.poderDeFogo = 10;
	}

	public boolean estaVivo() {
		return this.vida > 0;
	}

	public int getPoderDeFogo() {
		return this.poderDeFogo;
	}

	public String toString() {
		return this.vida + " " + this.poderDeFogo;
	}
	
	public void baleado(int poderDeFogo2) {
		this.vida -= poderDeFogo2;		
	}

	public void baleado(Navio navioAtacante) {
		this.vida -= navioAtacante.getPoderDeFogo();
	}
	
}
