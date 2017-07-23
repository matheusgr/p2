package r.a4.classes_banco;

public class Banco {

	private Conta[] contas;
	private int contasCadastradas;

	public Banco() {
		contas = new Conta[1000];
		contasCadastradas = 0;
	}

	public void cadastra(String cpf) {
		Conta contaACadastrar;
		if (contasCadastradas < 100) {
			contaACadastrar = new Conta(cpf, true);
		} else {
			contaACadastrar = new Conta(cpf, false);
		}
		contas[contasCadastradas] = contaACadastrar;
		contasCadastradas += 1;
	}

	public void imprime(String cpf) {
		Conta conta = consulta(cpf);
		System.out.println(conta.toString());
	}

	public Conta consulta(String cpf) {
		for (int i = 0; i < contasCadastradas; i++) {
			Conta conta = contas[i];
			if (conta.getCPF().equals(cpf)) {
				return conta;
			}
		}
		return null;
	}

}
