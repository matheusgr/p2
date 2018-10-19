package r.b3.interfaces.banco;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class BancoController {

	private Set<String> clientes;
	private Map<Integer, Contabil> contabeis;
	private BancoDeDados bd;

	public BancoController() {
		this.clientes = new TreeSet<>();
		this.contabeis = new HashMap<>();
	}
	
	public void cadastrarCliente(String cpf) {
		clientes.add(cpf);
	}

	public void cadastrarContaCorrente(String cpf, int chqEspecial, int numero, int quantia) {
		if (!clientes.contains(cpf)) {
			throw new IllegalArgumentException("Cliente n cadastrado");
		}
		contabeis.put(numero, new ContaCorrente(cpf, chqEspecial, quantia));
		this.bd.salvar(contabeis);
	}
	
	public void cadastrarContaFamilia(int numero, int conta1, int conta2) {
		contabeis.put(numero, new ContaFamilia(contabeis.get(conta1), contabeis.get(conta1)));
		this.bd.salvar(contabeis);
	}
	
	public void cadastrarPoupanca(String cpf, int numero, int quantia) {
		if (!clientes.contains(cpf)) {
			throw new IllegalArgumentException("Cliente n cadastrado");
		}
		contabeis.put(numero, new Poupanca(cpf, quantia));
	}

	public int sacar(int conta, int quantia) {
		Contabil contaObj = contabeis.get(conta);
		return contaObj.sacar(quantia);
	}

	public String getRepr(int conta) {
		Contabil contaObj = contabeis.get(conta);
		return Poupanca.codigo() + ": " + contaObj.reprBancaria();		
	}
	
	public void depositar(int conta, int quantia) {
		contabeis.get(conta).depositar(quantia);
	}
	
	public String listaContas() {
		List<Contabil> listaContabeis = new ArrayList<>(this.contabeis.values());
		Collections.sort(listaContabeis);
		Collections.sort(listaContabeis, new OrdenaContasMaiorSaldo());
		return "";
	}
	
}