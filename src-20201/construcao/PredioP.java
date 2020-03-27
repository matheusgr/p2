package construcao;

public class PredioP {
	
    private String nome;
    private int ano;
    private Endereco endereco;
    
    public PredioP(String nome, int ano, Endereco endereco) {
        this.nome = nome;
        this.ano = ano;
        this.endereco = endereco;
    }

    public String toString() {
    	return this.nome + " (" + this.ano + ") " + this.endereco.toString();
    }

    
}
