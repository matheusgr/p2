package r.a5.classes.controle_academico;

public class Turma {

	private Aluno[] alunos;
	private String nome;
	private int alunosCadastrados;

	public Turma(String nome) {
		this.nome = nome;
		this.alunos = new Aluno[1000];
		this.alunosCadastrados = 0;
	}

	public String getNome() {
		return this.nome;
	}

	public void cadastraAluno(Aluno aluno) {
		this.alunos[alunosCadastrados] = aluno;
		this.alunosCadastrados += 1;
	}

}