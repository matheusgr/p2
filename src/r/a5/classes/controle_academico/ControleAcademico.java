package r.a5.classes.controle_academico;

public class ControleAcademico {

	private Aluno[] alunos;
	private Turma[] turmas;
	private int alunosCadastrados;
	private int turmasCadastradas;

	public ControleAcademico() {
		this.alunos = new Aluno[30000];
		this.alunosCadastrados = 0;
		this.turmas = new Turma[3000];
		this.turmasCadastradas = 0;
	}

	public void cadastraAluno(String nome, int matricula) {
		this.alunos[alunosCadastrados] = new Aluno(nome, matricula);
		alunosCadastrados += 1;
	}

	public void cadastraAluno(String nome, int matricula, String apelido) {
		this.alunos[alunosCadastrados] = new Aluno(nome, matricula, apelido);
		alunosCadastrados += 1;
	}

	public void cadastraTurma(String nome) {
		this.turmas[turmasCadastradas] = new Turma(nome);
		turmasCadastradas += 1;
	}

	private Turma consultaTurma(String nome) {
		for (int i = 0; i < turmasCadastradas; i++) {
			if (turmas[i].getNome().equals(nome)) {
				return turmas[i];
			}
		}
		return null;
	}

	private Aluno consultaAluno(int matricula) {
		for (int i = 0; i < alunosCadastrados; i++) {
			if (alunos[i].getMatricula() == matricula) {
				return alunos[i];
			}
		}
		return null;
	}

	public void cadastraAlunoTurma(int matriculaAluno, String nome) {
		Turma turma = consultaTurma(nome);
		Aluno aluno = consultaAluno(matriculaAluno);
		turma.cadastraAluno(aluno);
	}

}