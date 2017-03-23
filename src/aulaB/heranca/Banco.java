package aulaB.heranca;

import java.util.HashMap;
import java.util.Map;

public class Banco {

	private Map<String, Conta> contas;

	public Banco() {
		contas = new HashMap<>();
	}

	public void cadastra(String cpf, String tipo) {
		if (tipo.equals("CC")) {
			contas.put(cpf, new ContaCorrente(cpf, 0, 2000));
		} else if (tipo.equals("P")) {
			contas.put(cpf, new Poupanca(cpf, 0));
		}
	}

	public void imprime(String cpf) {
		Conta conta = consulta(cpf);
		System.out.println(conta.toString());
	}

	public Conta consulta(String cpf) {
		return contas.get(cpf);
	}

}
