package c1.exceptions;

import java.util.HashMap;
import java.util.Map;

import r.a4.classes_sortidas.aluno.Aluno;

public class Main2 {
	
	public static void main(String[] args) {
		Main2 m = new Main2();
		try {
			m.setNome(123, "teste");
		} catch (IllegalArgumentException iae) {
			System.err.println("Deu erro de ilegal argument.");
		} catch (RuntimeException re) {
			System.err.println("Deu erro, mas eu nem ligo...");
		}
		System.out.println("fim");
	}
	
	public Aluno getAluno(int matr) throws Exception {
		if (matr < 0) {
			throw new Exception();
		}
		Map<String, Aluno> alunos = new HashMap<>();
		alunos.put("1234", new Aluno("teste"));
		return alunos.get("1234");
	}
	
	public void setNome(int matr, String novoNome) {
		try {
			Aluno a = getAluno(123);
			a.setNome("");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
}
