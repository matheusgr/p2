package r.a7.testes.disciplina;

public class Disciplina {

	private String nome;
	private double[] notas;



	public Disciplina(String nome) {
		if (nome == null) {
			throw new NullPointerException("Nome nulo");
		}
		this.nome = nome;
		this.notas = new double[4];
	}

	public boolean aprovado() {
		double soma = 0;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		return soma / 4 >= 7.0;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!this.getClass().equals(obj.getClass())) {
			return false;
		}
		Disciplina outraDisciplina = (Disciplina) obj;
		if (this.nome.equals(outraDisciplina.nome)) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return nome.hashCode();
	}


	public void cadastraNota(int i, double d) {
		this.notas[i-1] = d;
	}

}
