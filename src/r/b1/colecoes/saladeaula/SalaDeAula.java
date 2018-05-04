package r.b1.colecoes.saladeaula;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SalaDeAula {

	private Set<String> alunos;
	private List<String> respondoes;

	public SalaDeAula() {
		this.alunos = new HashSet<>();
		this.respondoes = new ArrayList<>();
	}
	
	public void cadastrar(String aluno) {
		this.alunos.add(aluno);
	}
	
	public void registrarResposta(String aluno) {
		if (!this.alunos.contains(aluno)) {
			throw new IllegalArgumentException("Aluno na sala errada");
		}
		this.respondoes.add(aluno);
	}
	
	public String listaRespondoes() {
		String resposta = "";
		for (String respondao : this.respondoes) {
			resposta += respondao + System.lineSeparator();
		}
		return resposta;
	}
	
	public int contagemRespondoes() {
		return (new HashSet<>(this.respondoes)).size();
	}
	
}