package r.a4.classes_sortidas.pessoa;

public class Funcao {

	private String nome;

	public Funcao(String nomeDaFuncao) {
		this.nome = nomeDaFuncao;
	}

	public int getBonus() {
		if (this.nome.equals("Txutxucador")) {
			return 50;
		} else if (this.nome.equals("Dirlidador")) {
			return 20;
		} else if (this.nome.equals("Coisador")) {
			return 30;
		} else {
			return 0;
		}
	}

}
