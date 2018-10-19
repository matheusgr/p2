package r.b3.interfaces.rebuliss;

import java.util.HashSet;

public class Caminhada implements Promocao {

	private Usuario donoDaCaminhada;
	private String origem;
	private String destino;
	private int id;
	private HashSet<Usuario> seguidores;
	private Estado estado;

	public Caminhada(int id, Usuario u, String origem, String destino) {
		this.id = id;
		this.donoDaCaminhada = u;
		this.origem = origem;
		this.destino = destino;
		this.seguidores = new HashSet<>();
		this.estado = Estado.ATIVO;
		this.cadastraSeguidor(u);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((origem == null) ? 0 : origem.hashCode());
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
		Caminhada other = (Caminhada) obj;
		if (id != other.id)
			return false;
		if (origem == null) {
			if (other.origem != null)
				return false;
		} else if (!origem.equals(other.origem))
			return false;
		return true;
	}

	public void cadastraSeguidor(Usuario u) {
		this.seguidores.add(u);
	}

	public void conclua() {
		if (this.estado.equals(Estado.CONCLUIDO)) {
			return;
		}
		this.estado = Estado.CONCLUIDO;
		for (Usuario u : seguidores) {
			u.caminhou();
		}
	}

	public String getPromocao() {
		return "Origem... " + this.origem + " / " + this.destino;
	}

	@Override
	public String toString() {
		return donoDaCaminhada.getLogin() + " Caminhada [origem=" + origem + ", destino=" + destino + ", estado=" + estado + "]";
	}
	
	

	
	
}
