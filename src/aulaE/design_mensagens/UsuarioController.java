package aulaE.design_mensagens;

import java.util.HashMap;
import java.util.Map;

public class UsuarioController {

	private Map<String, Usuario> usuarios;
	private Usuario logado;
	private Persistencia persistencia;

	public UsuarioController() {
		this.usuarios = new HashMap<>();
		this.persistencia = new Persistencia("data");
	}

	public void login(String nome) {
		if (!usuarios.containsKey(nome)) {
			usuarios.put(nome, new Usuario(nome));
		}
		this.logado = usuarios.get(nome);
	}

	public void criaLembrete(String msg) {
		this.logado.criaLembrete(msg);
	}

	public String listarLembrete() {
		String retorno = "";
		for (Lembrete l : this.logado.getLembretes()) {
			retorno += l + System.lineSeparator();
		}
		return retorno;
	}

	public void salvar() throws PersistenciaException {
		this.persistencia.salvar(this.logado);
	}

	public void carregar() throws PersistenciaException {
		this.persistencia.carregar(this.logado);

	}

}
