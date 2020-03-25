package futebol;

public class RepositorioDeJogadores {

	private Jogador[] jogadores;
	private int jogadoresCadastros;

	public RepositorioDeJogadores() {
		this.jogadores = new Jogador[100];
		this.jogadoresCadastros = 0;
	}
	
	public void cadastrarJogador(String nome, int numero, String posicao) {
		Jogador j = new Jogador(nome, numero, posicao);
		this.aumentaLimiteJogadoresCadastrados();
		this.jogadores[this.jogadoresCadastros] = j;
		this.jogadoresCadastros += 1;
	}

	private void aumentaLimiteJogadoresCadastrados() {
		if (this.jogadoresCadastros == this.jogadores.length) {
			Jogador[] novoJogadores = new Jogador[2 * this.jogadores.length];
			System.arraycopy(jogadores, 0, novoJogadores, 0, this.jogadores.length);
			this.jogadores = novoJogadores;
		}
	}

	public void adicionaGol(String nome, int numero) {
		Jogador j = this.getJogador(nome, numero);
		j.adicionaGol();
	}
	
	public Jogador getJogador(String nome, int numero) {
		for (int i = 0; i < this.jogadoresCadastros; i++) {
			Jogador jogador = jogadores[i];
			if (jogador.ehNomeENumero(nome, numero)) {
				return jogador;
			}
		}
		return null;
	}

	public Jogador getArtilheiro() {
		if (this.jogadoresCadastros == 0) {
			return null;
		}
		Jogador artilheiro = this.jogadores[0];
		int maisGols = artilheiro.getGols();
		for (int i = 1; i < this.jogadoresCadastros; i++) {
			Jogador jogador = jogadores[i];
			if (jogador.getGols() > maisGols) {
				artilheiro = jogador;
				maisGols = jogador.getGols();
			}
		}
		return artilheiro;
	}

	public int contaJogadores() {
		return this.jogadoresCadastros;
	}

	public Jogador[] getJogadores(String posicao) {
		Jogador[] jogadoresTmp = new Jogador[this.jogadoresCadastros];
		int jogadoresEncontrados = 0;
		for (int i = 0; i < this.jogadoresCadastros; i++) {
			Jogador jogador = jogadores[i];
			if (jogador.ehPosicao(posicao)) {
				jogadoresTmp[jogadoresEncontrados] = jogador;
				jogadoresEncontrados += 1;
			}
		}
		Jogador[] retorno = new Jogador[jogadoresEncontrados];
		System.arraycopy(jogadoresTmp, 0, retorno, 0, jogadoresEncontrados);
		return retorno;
	}
	
}
