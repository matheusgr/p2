package r.b3.interfaces.rebuliss;

import java.util.HashSet;

public class PromocaoController {

	private SistemaController sistema;
	private HashSet<Promocao> coisasPromovidas;

	public PromocaoController(SistemaController sistema) {
		this.sistema = sistema;
		this.coisasPromovidas = new HashSet<Promocao>();
	}

	public void promoveUsuario(String login) {
		Usuario u = this.sistema.recuperaUsuario(login);
		this.coisasPromovidas.add(u);
	}

	public void promoveCaminhada(int id) {
		Caminhada c = this.sistema.recuperaCaminhada(id);
		this.coisasPromovidas.add(c);
	}

	public String listaPromocoes() {
		String promo = "";
		for (Promocao o : this.coisasPromovidas) {
			promo += o.getPromocao() + System.lineSeparator();
		}
		return promo;
	}
	
	public double listaCustoPromocoes() {
		double total = 0;
		for (Promocao o : this.coisasPromovidas) {
			total += o.getCustoPromocao();
		}
		return total;
	}

}
