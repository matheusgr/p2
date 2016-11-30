package aula7.testes_respostas;

public class Pacote {

	private int peso;

	public Pacote(String nome, int peso) {
		if (peso < 1) {
			throw new RuntimeException("Pacote de peso invalido");
		}
		this.peso = peso;
	}

	public double getPreco() {
		if (this.peso <= 5) {
			return this.peso * 10;
		}
		return 50 + (this.peso - 5) * 15;
	}

}
