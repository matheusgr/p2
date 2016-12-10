package aulaA.colecoes_respostas.ryver;

public class Mensagem {

	private Usuario usuario;
	private String texto;

	public Mensagem(Usuario usuario, String texto) {
			this.usuario = usuario;
			this.texto = texto;
	}
	
	@Override
	public String toString() {
		return this.usuario.getNome() + ": " + this.texto;
	}

}
