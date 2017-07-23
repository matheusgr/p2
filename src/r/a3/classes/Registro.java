package r.a3.classes;

public class Registro {

	String nome;
	String telefone;

	public Registro(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public String print(int posicao) {
		return posicao + ". NOME: " + nome + System.lineSeparator() + posicao + ". TELEFONE: " + telefone;
	}

	public String print() {
		return "NOME: " + nome + System.lineSeparator() + "TELEFONE: " + telefone;
	}

}
