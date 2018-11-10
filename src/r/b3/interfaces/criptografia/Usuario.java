package r.b3.interfaces.criptografia;
import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private int id;
	private Criptografia cripto;
	private List<String> textos;

	public Usuario(int id, Criptografia cripto) {
		this.id = id;
		this.cripto = cripto;
		this.textos = new ArrayList<>();
	}

	public String criptografar(String texto) {
		String msgCifrada = this.cripto.criptografar(texto);
		this.textos.add(msgCifrada);
		return msgCifrada;
	}

	public void configura(Criptografia cripto) {
		this.cripto = cripto;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", cripto=" + cripto + "]";
	}
	
}
