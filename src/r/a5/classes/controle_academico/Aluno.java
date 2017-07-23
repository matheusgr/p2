package r.a5.classes.controle_academico;

public class Aluno {

	private int matricula;
	private String nome;
	private String apelido;

	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public Aluno(String nome, int matricula, String apelido) {
		this.nome = nome;
		this.matricula = matricula;
		this.apelido = apelido;
	}

	public void imprime() {
		if (this.apelido == null) {
			System.out.println(this.nome + ": " + this.matricula);
		} else {
			System.out.println(this.nome + ": " + this.matricula + " (" + this.apelido + ")");
		}
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public int getMatricula() {
		return matricula;
	}

}