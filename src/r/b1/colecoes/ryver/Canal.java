package r.b1.colecoes.ryver;

import java.util.ArrayList;
import java.util.HashSet;

public class Canal {

	private static final String NL = System.lineSeparator();
	private String nome;
	private HashSet<Usuario> usuarios;
	private ArrayList<Mensagem> msgs;

	public Canal(String nomeCanal) {
		this.nome = nomeCanal;
		this.usuarios = new HashSet<Usuario>();
		this.msgs = new ArrayList<Mensagem>();
	}

	public void enviaMensagem(Usuario usuario, String texto) {
		Mensagem msg = new Mensagem(usuario, texto);
		if (this.usuarios.contains(usuario)) {
			this.msgs.add(msg);
		}
	}

	public void sai(Usuario usuario) {
		this.usuarios.remove(usuario);
	}

	public void entra(Usuario usuario) {
		this.usuarios.add(usuario);
	}

	public String imprime() {
		String retorno = "";
		for (Usuario usuario : usuarios) {
			retorno += usuario.getNome() + NL;
		}
		for (Mensagem msg : msgs) {
			retorno += msg + NL;
		}
		return retorno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Canal other = (Canal) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
