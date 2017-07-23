package r.b1.colecoes.ryver;

public class Usuario {

	private String nome;
	private String status;

	public Usuario(String nomeUsuario, String status) {
		this.nome = nomeUsuario;
		this.status = status;
	}

	public String getNome() {
		return this.nome;
	}

	public String getStatus() {
		return this.status;
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
		Usuario other = (Usuario) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
