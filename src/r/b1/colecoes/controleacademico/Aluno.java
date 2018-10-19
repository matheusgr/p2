package r.b1.colecoes.controleacademico;

public class Aluno {

	private String nome;
	private double nota;

	public Aluno(String nome) {
		this.nome = nome;
		this.nota = Double.NaN;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", nota=" + nota + "]";
	}

}
