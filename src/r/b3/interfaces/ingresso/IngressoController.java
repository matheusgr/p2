package r.b3.interfaces.ingresso;
import java.util.HashMap;
import java.util.Map;

public class IngressoController {

	private Map<String, Ingresso> ingressos;
	private int id;
	
	public IngressoController() {
		this.ingressos = new HashMap<>();
		this.id = 0;
	}
	
	public String criarIngressoBase() {
		IngressoBase ing = new IngressoBase(this.id);
		this.id += 1;
		this.ingressos.put(ing.getId(), ing);
		return ing.getId();
	}

	public String criarIngressoCamarote(String localizacao, int cabine) {
		IngressoCamarote ic = new IngressoCamarote(this.id, localizacao, cabine);
		this.id += 1;
		this.ingressos.put(ic.getId(), ic);
		return ic.getId();
	}

	public String pegarIngresso(String cod) {
		if (this.ingressos.containsKey(cod)) {
			return this.ingressos.get(cod).toString();
		}
		return null;
	}

}
