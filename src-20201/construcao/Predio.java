package construcao;

public class Predio {
	
    private String nome;
    private int ano;
    private Endereco endereco;
    
    public Predio(String nome, int ano, String rua, String numero, String cidade, String estado, String pais, String cep) {
        this.nome = nome;
        this.ano = ano;
        this.endereco = new Endereco(rua, numero, cidade, estado, pais, cep);
    }
    
    public String toString() {
    	return this.nome + " (" + this.ano + ") " + this.endereco.toString();
    }

	public void setNumero(String novoNumero) {
		this.endereco.setNumero(novoNumero);
	}

}
