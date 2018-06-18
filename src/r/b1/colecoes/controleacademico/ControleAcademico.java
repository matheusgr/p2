package r.b1.colecoes.controleacademico;

import java.util.HashMap;

public class ControleAcademico {

	private HashMap<String, Aluno> alunos;

	public ControleAcademico() {
		this.alunos = new HashMap<>();
	}
	
	public void cadastreAluno(String matr, String nome) {
		this.alunos.put(matr, new Aluno(nome));
	}
	
	public void cadastreNota(String matr, double nota) {
		Aluno a = this.alunos.get(matr);
		a.setNota(nota);
		// ou... this.alunos.get(matr).setNota(nota);
	}
	
	public String listaAlunos() {
		String res = "";
		for (Aluno a : this.alunos.values()) {
			res += a.toString() + System.lineSeparator();
		}
		return res;
	}
	
}
