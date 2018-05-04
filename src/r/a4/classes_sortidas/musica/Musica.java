package r.a4.classes_sortidas.musica;

public class Musica {

	private int duracao;
	private String nome;

	public Musica(int duracao, String nome) {
		this.duracao = duracao;
		this.nome = nome;
	}
	
	public String toString() {
		return this.nome + " (" + this.duracao + "s)";
	}

	public void setNome(String novoNome) {
		this.nome = novoNome.toUpperCase();
	}
	
}
