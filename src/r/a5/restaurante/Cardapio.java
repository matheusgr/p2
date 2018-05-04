package r.a5.restaurante;

public class Cardapio {

	private Refeicao[] refeicoes;
	private int refeicoesArmazenadas;

	public Cardapio() {
		this.refeicoes = new Refeicao[100];
		this.refeicoesArmazenadas = 0;
	}
	
	public void cadastraRefeicao(String codigo, double valor, int numPessoas, String descr) {
		if (procuraRefeicao(codigo) != null) {
			throw new RuntimeException("CODIGO JAH EXISTENTE");
		}
		Refeicao r = new Refeicao(codigo, valor, numPessoas, descr);
		this.refeicoes[this.refeicoesArmazenadas] = r;
		this.refeicoesArmazenadas += 1;
	}

	private Refeicao procuraRefeicao(String codigo) {
		for (int i = 0; i < this.refeicoesArmazenadas; i++) {
			Refeicao r = this.refeicoes[i];
			if (r.getCodigo().equals(codigo)) {
				return r;
			}
		}	
		return null;
	}

	@Override
	public String toString() {
		String resultado = "";
		for (int i = 0; i < this.refeicoesArmazenadas; i++) {
			resultado += this.refeicoes[i].toString() + System.lineSeparator();
		}
		return resultado;
	}

	public void alteraValor(String codigo, double valor) {
		procuraRefeicao(codigo).setValor(valor);		
	}
	
}
