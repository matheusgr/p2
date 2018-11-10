package r.a3.classes_ludo;

public class Loja {

	private Jogo[] jogos;
	private int jogosCadastrados;
			
	public Loja() {
		this.jogos = new Jogo[1000];
		this.jogosCadastrados = 0;
	}
	
	public void cadastrarJogo(int cod, String nome, String desc) {
		this.jogos[this.jogosCadastrados] = new Jogo(cod, nome, desc);
		this.jogosCadastrados += 1;
	}

	public void alugarJogo(int cod) {
		Jogo jogo = this.getJogo(cod);
		jogo.aluguel();
	}

	private Jogo getJogo(int cod) {
		for (int i = 0; i < this.jogosCadastrados; i++) {
			Jogo jogo = jogos[i];
			if (jogo.getCod() == cod) {
				return jogo;
			}
		}
		return null;
	}

	public void devolverJogo(int cod) {
	
	}

	public int getQtdAlugueisJogo(int cod) {
		Jogo jogo = this.getJogo(cod);
		return jogo.getQtdAlugueis();
	}

}
