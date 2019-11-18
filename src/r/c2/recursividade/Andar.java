package r.c2.recursividade;
public class Andar {
	private int salas;
	private Andar andarAcima;

	public Andar(int salas) {
		this.salas = salas;
		this.andarAcima = null;
	}

	public void novoAndar(int salas) {
		// adiciona um novo andar, mas só permite se salas for menor do que o valor no
		// andar no topo
		if (salas > this.salas) {
			throw new IllegalArgumentException();
		}
		if (this.andarAcima == null) {
			this.andarAcima = new Andar(salas);
			return;
		}
		this.andarAcima.novoAndar(salas);
	}

	public int contaAndares() {
		if (this.andarAcima == null) {
			return 1;
		}

		return 1 + this.andarAcima.contaAndares();
	}

	public int contaSalasDosAndaresPares(int cont) {
		if (cont % 2 == 0) {
			if (this.andarAcima == null)
				return this.salas;
			else
				return this.salas + this.andarAcima.contaSalasDosAndaresPares(cont + 1);
		} else {
			if (this.andarAcima == null)
				return 0;
			else
				return this.andarAcima.contaSalasDosAndaresPares(cont + 1);
		}
	}

	// SALAS DO ANDAR DO TOPO
	// SALAS DO PENULTIMO ANDAR
	// ...
	// SALAS DO PRIMEIRO ANDAR
	public String toString() {
		return "";
	}
}
