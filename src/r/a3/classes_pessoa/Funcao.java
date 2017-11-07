package r.a3.classes_pessoa;

/**
 * Função que uma pessoa assume no programa. Toda função tem um bônus associado
 * (padrão é 10) e pode ser complementado com um valor extra.
 * 
 * @author matheusgr
 */
public class Funcao {

	/**
	 * Complemento a ser adicionado no bônus.
	 */
	private int complemento;

	/**
	 * Nome da função exercida.
	 */
	private String nome;

	/**
	 * Construtor básico de função.
	 * 
	 * @param funcao
	 *            Nome da função exercida.
	 */
	public Funcao(String funcao) {
		this.nome = funcao;
	}

	/**
	 * Retorna o bônus da pessoa dependendo do tipo de atividade que ela exerce
	 * e o complemento pertencente. Se a função for abacateiro o bônus é
	 * integral, caso contrário, apenas a metade do valor.
	 * 
	 * @return O Bônus da pessoa.
	 */
	public int getBonus() {
		if (this.nome.equals("Abacateiro")) {
			return 20 + this.complemento;
		}
		return 10 + (this.complemento / 2);
	}

	/**
	 * Método para adição do complemento a ser colocado no bônus.
	 * 
	 * @param complemento
	 *            Valor do complemento a ser adicioado ao bônus.
	 */
	public void adicionaComplemento(int complemento) {
		this.complemento += complemento;
	}

}
