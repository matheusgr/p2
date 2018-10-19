package r.b3.interfaces.rebuliss;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SistemaController {

	private Map<String, Usuario> usuarios;
	private Map<Integer, Caminhada> caminhadas;
	private int id;
	private Set<Caminhada> caminhadasAtivas;

	
	
	public SistemaController() {
		this.usuarios = new HashMap<String, Usuario>();
		this.caminhadas = new HashMap<Integer, Caminhada>();
		this.caminhadasAtivas = new HashSet<Caminhada>();
		this.id = 0;
	}
	
	public void cadastraUsuario(String login, String email, String url) {
		Usuario u = new Usuario(login, email, url);
		this.usuarios.put(login, u);
	}

	public int cadastraCaminhada(String login, String origem, String destino) {
		Usuario u = this.usuarios.get(login);
		Caminhada c = new Caminhada(this.id, u, origem, destino);
		this.caminhadas.put(this.id, c);
		int idCriado = this.id;
		this.id += 1;
		this.caminhadasAtivas.add(c);
		return idCriado;
	}
	
	public void cadastraSeguidor(int id, String login) {
		Usuario u = this.usuarios.get(login);
		Caminhada c = this.caminhadas.get(id);
		c.cadastraSeguidor(u);
	}

	public void concluirCaminhada(int id) {
		Caminhada c = this.caminhadas.get(id);
		if (!caminhadasAtivas.contains(c)) {
			return;
		}
		this.caminhadasAtivas.remove(c);
		c.conclua();
	}

	public Usuario recuperaUsuario(String login) {
		return this.usuarios.get(login);
	}

	public Caminhada recuperaCaminhada(int idCaminhada) {
		return this.caminhadas.get(idCaminhada);
	}
	
}
