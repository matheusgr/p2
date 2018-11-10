package r.b3.interfaces.criptografia;

public class Rot13 implements Criptografia {

	@Override
	public String criptografar(String texto) {
		String resultado = "";
		for (char c: texto.toCharArray()) {
			c += 13;
			c %= 'A';
			c += 'A';
			resultado += c;
		}
		return resultado;
	}

}
