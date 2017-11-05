package c3.refatoramento;

import java.util.HashMap;
import java.util.Map;

public class RoboController {

	private Map<String, Robo> robos;

	public RoboController() {
		this.robos = new HashMap<String, Robo>();
	}

	public void criarRobo(String nome, int energia) {
		robos.put(nome, new Robo(energia));
	}

	public void armar(String robo, String arma) {
		robos.get(robo).armar(arma);
	}

	public String atirar(String robo) {
		return robos.get(robo).tiro();
	}
	
	
	
}
