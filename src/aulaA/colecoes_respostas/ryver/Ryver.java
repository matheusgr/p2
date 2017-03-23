package aulaA.colecoes_respostas.ryver;

import java.util.HashMap;

/**
 * Classe responsável por controlar os usuários e os canais do sistema.
 * 
 * @author matheusgr
 */
public class Ryver {

	private HashMap<String, Usuario> usuarios;
	private HashMap<String, Canal> canais;

	public Ryver() {
		this.usuarios = new HashMap<String, Usuario>();
		this.canais = new HashMap<String, Canal>();
	}

	/**
	 * Adiciona um usuário. Não importa para o sistema a ordem que os usuários
	 * são inseridos. Ainda, ao inserir um nome que já existe, isso sobrescreve
	 * qualquer usuário que esteja no meu sistema.
	 * 
	 * @param nomeUsuario
	 *            Nome do usuário a ser adicionado.
	 * @param status
	 *            Status do usuário no sistema.
	 * @return
	 */
	public boolean adicionaUsuario(String nomeUsuario, String status) {
		Usuario novoUsuario = new Usuario(nomeUsuario, status);
		if (usuarios.containsKey(nomeUsuario)) {
			return false;
		}
		usuarios.put(nomeUsuario, novoUsuario);
		return true;
	}

	public void adicionaCanal(String nomeCanal) {
		Canal novoCanal = new Canal(nomeCanal);
		canais.put(nomeCanal, novoCanal);
	}

	public void entra(String nomeCanal, String nomeUsuario) {
		Canal canal = canais.get(nomeCanal);
		Usuario usuario = usuarios.get(nomeUsuario);
		canal.entra(usuario);
	}

	public void sai(String nomeCanal, String nomeUsuario) {
		Canal canal = canais.get(nomeCanal);
		Usuario usuario = usuarios.get(nomeUsuario);
		canal.sai(usuario);
	}

	public void envia(String nomeCanal, String nomeUsuario, String texto) {
		Canal canal = canais.get(nomeCanal);
		Usuario usuario = usuarios.get(nomeUsuario);
		canal.enviaMensagem(usuario, texto);
	}

	public String imprime(String nomeCanal) {
		Canal canal = canais.get(nomeCanal);
		return canal.imprime();
	}

}