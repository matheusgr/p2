package r.b2.stim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsuarioController {

	private Map<String, Usuario> usuarios;
	private Comparator<Usuario> estrategiaOrdenacao;

	public UsuarioController() {
		this.usuarios = new HashMap<>();
	}
	
	public void cadastraUsuario(String id) {
		this.usuarios.put(id, new Usuario(id));
	}

	public Usuario getUsuario(String idUsuario) {
		return this.usuarios.get(idUsuario);
	}
	
	public void configuraOrdenacao(String ordenacao) {
		if (ordenacao.equals("ID")) {
			this.estrategiaOrdenacao = new IdComparator();
		} else if (ordenacao.equals("XP")) {
			this.estrategiaOrdenacao = new XpComparator();
		}
	}
	
	public String listaUsuarios() {
		List<Usuario> listaUsuarios = new ArrayList<>(usuarios.values());
		Collections.sort(listaUsuarios, this.estrategiaOrdenacao);
		String resultado = "";
		for (Usuario u : listaUsuarios) {
			resultado += u.toString() + System.lineSeparator();
		}
		return resultado;
	}
	
}
