package r.b3.interfaces.criptografia;

public class Exp implements Criptografia {

	@Override
	public String criptografar(String texto) {
		String resultado = "";
		for (char c: texto.toCharArray()) {
			resultado += c;
			resultado += c;
		}
		return resultado;
	}

}
