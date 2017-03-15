package aulaC.arquivos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Usuario implements Serializable {

	private List<Lembrete> lembretes;
	private String nome;

	public Usuario(String nome) {
		this.lembretes = new ArrayList<>();
		this.nome = nome;
	}

	public void criaLembrete(String msg) {
		this.lembretes.add(new Lembrete(msg));
	}

	public List<Lembrete> getLembretes() {
		return Collections.unmodifiableList(this.lembretes);
	}

	public String getLogin() {
		return this.nome;
	}

	public void setLembretes(List<Lembrete> lembretes) {
		this.lembretes = lembretes;
	}

}
