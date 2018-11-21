package r.a4.classes_sortidas.aluno;

public class Aluno {

	public String nome;
	
	public int idade;
	
	public double nota;

	public Aluno(String nome) {
		this.nome = nome;
		this.idade = 18;
		this.nota = 7;
	}
	
	public Aluno(String nome, int idade, double nota) {
		this.nome = nome;
		this.idade = idade;
		this.nota = nota;
	}

	public boolean idadeENotaApropriada() {
		return (this.idade > 20 && this.nota >= 7);
	}
	
	public boolean idadeENotaApropriada(int notaAdequada) {
		return (this.idade > 20 && this.nota >= notaAdequada);
	}

	public void setNome(String string) {
		if (string == null || string.trim().equals("")) {
			throw new IllegalArgumentException("Nome invalido");
		}
		this.nome = string;
	}
	
}
