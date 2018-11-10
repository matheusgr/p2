package r.a3.classes_ludo;

public class Jogo {

	private int cod;
	private String nome;
	private String desc;
	private int alugueis;

	public Jogo(int cod, String nome, String desc) {
		if (nome == null) {
			throw new NullPointerException("nome nulo");
		}
		if ("".equals(nome.trim())) {
			throw new IllegalArgumentException("nome vazio");
		}
		this.cod = cod;
		this.nome = nome;
		this.desc = desc;
		this.alugueis = 0;
	}

	public void aluguel() {
		this.alugueis += 1;
	}

	public int getCod() {
		return this.cod;
	}

	public int getQtdAlugueis() {
		return this.alugueis;
	}

	@Override
	public String toString() {
		return "Jogo [cod=" + cod + ", nome=" + nome + ", desc=" + desc + "]";
	}
	
}
