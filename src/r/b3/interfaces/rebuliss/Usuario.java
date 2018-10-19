package r.b3.interfaces.rebuliss;

public class Usuario implements Promocao, Comparable<Usuario> {

	private String login;
	private String email;
	private String url;
	private int totalCaminhadas;

	public Usuario(String login, String email, String url) {
		this.login = login;
		this.email = email;
		this.url = url;
		this.totalCaminhadas = 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
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
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		return true;
	}

	public void caminhou() {
		this.totalCaminhadas += 1;
	}

	public String getPromocao() {
		return "****** " + this.toString() + " " + this.totalCaminhadas + "!!!";
	}

	@Override
	public String toString() {
		return "Usuario [login=" + login + ", email=" + email + ", url=" + url + "]";
	}

	@Override
	public int compareTo(Usuario o) {
		int comp = this.totalCaminhadas - o.totalCaminhadas;
		if (comp == 0) {
			return this.login.compareTo(o.login);
		}
		return comp;
	}

	public String getLogin() {
		return this.login;
	}

	public String getEmail() {
		return this.email;
	}

}
