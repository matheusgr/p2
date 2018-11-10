package r.b1.colecoes.alunos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<Integer, Aluno> a = new HashMap<>();
		a.put(1, new Aluno(new IdAluno(1, "COMP"), "Matheus"));
		a.put(10, new Aluno(new IdAluno(10, "PSI"), "Gabriel"));
		a.put(5, new Aluno(new IdAluno(5, "COMP"), "Thais"));
		List<Aluno> values = new ArrayList<>(a.values());
		values.sort(new AlunoComparador());
	}
	
}