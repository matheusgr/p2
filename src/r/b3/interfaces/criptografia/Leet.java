package r.b3.interfaces.criptografia;

public class Leet implements Criptografia {

	@Override
	public String criptografar(String texto) {
		String resultado = "";
		for (char c: texto.toCharArray()) {
			if (c == 'A') {
				resultado += '4';
			} else if (c == 'E') {
				resultado += '3';
			} else if (c == 'I') {
				resultado += '1';
			} else if (c == 'O') {
				resultado += '0';
			} else if (c == 'U') {
				resultado += "|_|";
			} else {
				resultado += c;				
			}
		}
		
		return resultado;
	}

}
