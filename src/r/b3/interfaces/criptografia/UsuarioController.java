package r.b3.interfaces.criptografia;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsuarioController {

	private Map<Integer, Usuario> usuarios;

	public UsuarioController() {
		this.usuarios = new HashMap<>();
	}
	
	public String criptografar(int id, String texto) {
		Usuario u = this.pegaUsuario(id);
		return u.criptografar(texto);
	}

	private Usuario pegaUsuario(int id) {
		Usuario u = this.usuarios.getOrDefault(id, new Usuario(id, new Rot13()));
		this.usuarios.put(id, u);
		return u;
	}

	public void configurar(int id, String alg) {
		switch (alg) {
		case "ROT13":
			this.pegaUsuario(id).configura(new Rot13());
			break;
		case "EXP":
			this.pegaUsuario(id).configura(new Exp());
			break;
		case "LEET":
			this.pegaUsuario(id).configura(new Leet());
			break;

		default:
			throw new UnsupportedOperationException("ALG INVALIDO");
		}
	}

	public List<String> listarTextos(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
