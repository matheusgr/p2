package r.a4.classes_sortidas.pessoa;

import java.util.Calendar;

public class Pessoa {

	private String nome;
	private int anoNascimento;
	private Endereco endereco;
	private Funcao funcao;

	public Pessoa(String nome, int anoNascimento, Endereco endereco, String funcao, int salario, int numeroEmpregos) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.endereco = endereco;
		this.funcao = new Funcao(funcao);
	}
	
	public int getBonus() {
		return this.funcao.getBonus();
	}
	
	public String toString() {
		return this.nome + " - " + this.getIdade() + "(" + this.endereco.toString() + ")";
	}

	private int getIdade() {
		return Calendar.getInstance().get(Calendar.YEAR) - anoNascimento;
	}

}
