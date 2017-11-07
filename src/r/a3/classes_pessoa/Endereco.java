package r.a3.classes_pessoa;

/**
 * Representação de um endereço. Todo endereço tem rua, número, cidade, estado e
 * país. Ignora-se os demais aspectos de endereço e limita-se o 'número da casa'
 * a um inteiro (o que não é realista).
 * 
 * @author matheusgr
 *
 */
public class Endereco {

	/**
	 * Descrição da rua do endereço. Deve incluir prefixos como "Rua",
	 * "Avenida", ...
	 */
	private String rua;

	/**
	 * Número da casa.
	 */
	private int numero;

	/**
	 * Cidade do endereço.
	 */
	private String cidade;

	/**
	 * Estado do endereço. Não use abreviaturas, nem caixa-alta.
	 */
	private String estado;

	/**
	 * País do endereço. Não use abreviaturas, nem caixa-alta.
	 */
	private String pais;

	/**
	 * Construtor padrão de endereço. Todos os atributos são passados para a
	 * construção desse objeto.
	 * 
	 * @param rua
	 *            Rua do endereço em questão.
	 * @param numero
	 *            Número do endereço em questão.
	 * @param cidade
	 *            Cidade do endereço em questão.
	 * @param estado
	 *            Estado do endereço em questão.
	 * @param pais
	 *            País do endereço em questão.
	 */
	public Endereco(String rua, int numero, String cidade, String estado, String pais) {
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}

	/**
	 * Representação em String do endereço. Gera uma representação elegante do
	 * endereço no formato "Rua - Numero. Cidade, Estado, Pais."
	 */
	@Override
	public String toString() {
		return this.rua + " - " + this.numero + ". " + this.cidade + ", " + this.estado + ", " + this.pais;
	}

	/**
	 * Altera a rua do endereço
	 * 
	 * @param rua
	 *            Novo valor para o nome da rua. Deve incluir o prefixo (Rua,
	 *            Avenida, ...).
	 */
	public void setRua(String rua) {
		this.rua = rua;
	}

}
