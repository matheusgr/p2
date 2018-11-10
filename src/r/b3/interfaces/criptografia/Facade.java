package r.b3.interfaces.criptografia;
import java.util.List;


// INUTILLLLLLLLLLLLLLLLLLLLLLLLL
public class Facade {

	private UsuarioController uc;


	public Facade() {
		this.uc = new UsuarioController();
	}
		
	public String criptografar(int id, String texto) {
		return this.uc.criptografar(id, texto);
	}

	public void configurar(int id, String alg) {
		this.uc.configurar(id, alg);
	}
	
	public List<String> listarTextos(int id) {
		return this.uc.listarTextos(id);
	}	
}
