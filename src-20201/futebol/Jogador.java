package futebol;

public class Jogador {

	private String nome;
	private int numero;
	private String posicao;
	private int gols;

	public Jogador(String nome, int numero, String posicao) {
		this.nome = nome;
		this.numero = numero;
		this.posicao = posicao;
		this.gols = 0;
	}

	public void adicionaGol() {
		this.gols += 1;
	}

	public int getGols() {
		return this.gols;
	}

	public boolean ehNomeENumero(String nome2, int numero2) {
		return this.nome.equals(nome2) && this.numero == numero2;
	}

	public String toString() {
		return this.nome + " (" + this.numero + ") - " + this.posicao;
	}

	public boolean ehPosicao(String posicao2) {
		return this.posicao.equals(posicao2);
	}
	
}
