package r.a3.classes_pessoa;

/**
 * Representação de uma pessoa com nome, ano nascimento, endereco e função. O
 * objeto pessoa se associa com um endereço (que pode ser o mesmo de outras
 * entidades) e tem uma função construída a partir do nome da função recebida
 * como parâmetro. A função define o bônus da pessoa e o ano de nascimento
 * define sua idade.
 * 
 * @author Matheus
 *
 */
public class Pessoa {

	/**
	 * Nome da pessoa.
	 */
	private String nome;

	/**
	 * Ano de nascimento no formato XXXX.
	 */
	private int anoNacimento;

	/**
	 * Endereço da pessoa.
	 */
	private Endereco endereco;

	/**
	 * Função da pessoa.
	 */
	private Funcao funcao;

	/**
	 * Construtor padrão da pessoa inicializado com os atributos nome,
	 * anoNascimento, endereco e funcao. Toda pessoa cria um objeto que
	 * representará sua função.
	 * 
	 * @param nome
	 *            Nome da pessoa.
	 * @param anoNascimento
	 *            Ano de nascimento (no formato XXXX).
	 * @param endereco
	 *            Endereço da pessoa.
	 * @param funcao
	 *            Função da pessoa. As funções mais comum são "Abacateiro" e
	 *            "Dentista".
	 */
	public Pessoa(String nome, int anoNascimento, Endereco endereco, String funcao) {
		this.nome = nome;
		this.anoNacimento = anoNascimento;
		this.endereco = endereco;
		this.funcao = new Funcao(funcao);
	}

	/**
	 * Retorna o bônus da pessoa baseando-se na função que exerce e no
	 * complemento recebido.
	 * 
	 * @return O bônus da pessoa.
	 */
	public int getBonus() {
		// Pessoa DELEGA essa chamada para funcao:
		return this.funcao.getBonus();
	}

	/**
	 * Adiciona complemento à função da pessoa.
	 * 
	 * @param complemento
	 *            Adiciona complemento à função da pessoa.
	 */
	public void adicionaComplemento(int complemento) {
		// Pessoa DELEGA essa chamada para funcao:
		this.funcao.adicionaComplemento(complemento);
	}

	/**
	 * Retorna representação em String da pessoa.
	 */
	@Override
	public String toString() {
		return this.nome + " - " + this.anoNacimento + " / " + this.endereco + " / " + this.getBonus();
	}

}
