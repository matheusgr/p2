package bb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContaController {
	
	private Map<Integer, ContaInterface> contas;

	public ContaController() {
		this.contas = new HashMap<>();
	}

	public void cadastrarContaCorrente(String cpf, int limite, int id) {
		this.contas.put(id, new ContaCorrente(cpf, limite));
	}

	public void cadastrarContaPoupanca(String cpf, int id) {
		this.contas.put(id, new Poupanca(cpf));
	}

	public void cadastrarContaFamilia(String cpf, int id, int id2) {
		ContaFamilia cf = new ContaFamilia(cpf, this.contas.get(id), this.contas.get(id2));
		this.contas.put(id, cf);
	}
	
	public void sacar(int conta, int valor) {
		this.contas.get(conta).sacar(valor);
	}

	public void depositar(int conta, int valor) {
		this.contas.get(conta).depositar(valor);
	}

	public String exibirContas() {
		String resultado = "";
		List<ContaInterface> contas = new ArrayList<>(this.contas.values());
		Collections.sort(contas, new ComparadorDeContasPorToString());
		return resultado;
	}
	
}
