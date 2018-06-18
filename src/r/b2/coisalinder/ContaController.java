package r.b2.coisalinder;

import java.util.HashMap;

public class ContaController {

	private HashMap<String, Conta> contas;
	
	public ContaController() {
		this.contas = new HashMap<>();
	}
	
	public void cadastraCC(String nome, String descr, int idade) {
		if (this.contas.containsKey(nome)) {
			throw new IllegalArgumentException("EI.. J� TEM.");
		}
		this.contas.put(nome, new ContaComum(nome, descr, idade));
	}
	
	public void cadastraCP(String nome, String descr, int idade) {
		if (this.contas.containsKey(nome)) {
			throw new IllegalArgumentException("EI.. J� TEM.");
		}
		this.contas.put(nome, new ContaPremium(nome, descr, idade));
	}
	
	public void lindar(String nome) {
		 this.contas.get(nome).lindar();
	}
	
	public void alteraDescr(String nome, String descr) {
		this.contas.get(nome).setDescr(descr);
	}
	
}
