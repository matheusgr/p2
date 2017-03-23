package aulaD.recursividade;

public class Aluno {

	private String nome;
	private double paquerabilidade;
	private Aluno paquera;

	Aluno(String nome, double nota) {
		this.nome = nome;
		this.paquerabilidade = nota;
	}

	Aluno(String nome, double nota, Aluno paquera) {
		this(nome, nota);
		this.paquera = paquera;
	}

	public String toString() {
		if (this.paquera == null) {
			return this.nome + " que ama ninguém.";
		}
		return this.nome + " que ama " + this.paquera.toString();
	}

	private String toStringReverso() {
		if (this.paquera == null) {
			return this.nome;
		}
		return this.paquera.toStringReverso() + " que é queridx por " + this.nome;
	}

	private double mediaPaquerabilidade() {
		double soma = this.paquerabilidade;
		int cont = 1;
		Aluno paqueraAtual = this.paquera;
		while (paqueraAtual != null) {
			soma += paqueraAtual.paquerabilidade;
			cont++;
			paqueraAtual = paqueraAtual.paquera;
		}
		return soma / cont;
	}

	private double mediaPaqRecursiva(double soma, int cont) {
		if (this.paquera == null) {
			return (this.paquerabilidade + soma) / (cont + 1);
		}
		return paquera.mediaPaqRecursiva(soma + this.paquerabilidade, cont + 1);
	}

	private double maiorPaq() {
		if (this.paquera == null) {
			return this.paquerabilidade;
		}
		return Math.max(this.paquerabilidade, this.paquera.maiorPaq());
	}

	private double mediaPaqRecursiva() {
		return paquera.mediaPaqRecursiva(this.paquerabilidade, 1);
	}

	public static void main(String[] args) {
		Aluno A3 = new Aluno("A3", 10.0);
		Aluno A2 = new Aluno("A2", 9.0, A3);
		Aluno A1 = new Aluno("A1", 9.5, A2);
		System.out.println(A1.toString());
		System.out.println(A1.toStringReverso());
		System.out.print(A1.maiorPaq());
		System.out.print(A1.mediaPaquerabilidade());
		System.out.print(A1.mediaPaqRecursiva());
	}

}
