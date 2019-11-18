package r.a3.classes_caesi.src.caesi;

public class Aluno {

	private String nome;
	
	private String matricula;

	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public String toString() {
		return this.nome + ": " + this.matricula;
	}
	
}
