package r.c3.refatoramento;

import java.util.HashMap;
import java.util.Map;

public class RoboController {

	private Map<String, RoboIf> robos;

	public RoboController() {
		this.robos = new HashMap<>();
	}

	public void criarRobo(String nome, int energia) {
		robos.put(nome, new Robo(energia, "3cpo"));
	}

	public void armar(ArmaConfiguracao conf) {
		robos.get(conf.getNome()).armar(conf.getArma());
	}

	public String atirar(String robo) {
		return robos.get(robo).atirar();
	}
	
	
	
}
