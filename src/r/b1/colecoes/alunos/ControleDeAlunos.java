package r.b1.colecoes.alunos;
import java.util.HashMap;
import java.util.Map.Entry;

public class ControleDeAlunos {

	private HashMap<IdAluno, Aluno> alunos;

	public ControleDeAlunos() {
		this.alunos = new HashMap<IdAluno, Aluno>();
	}

	public void adiciona(int cod, String curso, String nome) {
		IdAluno idAluno = new IdAluno(cod, curso);
		Aluno a = new Aluno(idAluno, nome);
		this.alunos.put(idAluno, a);
	}

	public int numAlunos() {
		return this.alunos.size();
	}

	public String pegaDetalhes(int i, String j) {
		IdAluno idAluno = new IdAluno(i, j);
		Aluno aluno = this.alunos.get(idAluno);
		return aluno.toString();
	}

	public String geraListao() {
		
		String resultado = "";
		for (IdAluno id : this.alunos.keySet()) {
			resultado += id + " " + this.alunos.get(id).toString() + System.lineSeparator();
		}
		
		resultado = "";
		for (Aluno a : this.alunos.values()) {
			resultado += a.toString() + System.lineSeparator();
		}
		
		resultado = "";
		for (Entry<IdAluno, Aluno> idEAluno : this.alunos.entrySet()) {
			idEAluno.getKey();
			idEAluno.getValue();
		}
		
		return resultado;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
}