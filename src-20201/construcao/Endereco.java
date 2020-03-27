package construcao;

public class Endereco {

	private String rua;
	private String numero;
	private String cidade;
	private String estado;
	private String pais;
	private String cep;

	public Endereco(String rua, String numero, String cidade, String estado, String pais, String cep) {
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
		this.cep = cep;
	}

	public String toString() {
		return this.rua + " - " + this.numero + " - " + this.cidade + " - " + this.estado + " - " + this.pais + " - "
				+ this.cep;
	}

	public void setNumero(String novoNumero) {
		this.numero = novoNumero;
	}

}
