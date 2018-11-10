package r.b1.colecoes.alunos;
import java.util.Comparator;

public class AlunoComparador implements Comparator<Aluno> {

	@Override
	public int compare(Aluno o1, Aluno o2) {
		return o1.getId().compareTo(o2.getId());
	}


}
