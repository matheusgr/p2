package aulaD.recursividade;

public class ConverteStringRecursaoMutua {

	public static String converte(String msg) {
		return cima(msg, 0);
	}

	public static String cima(String msg, int pos) {
		if (pos >= msg.length()) {
			return "";
		}
		return msg.toUpperCase().charAt(pos) + baixo(msg, pos + 1);
	}

	public static String baixo(String msg, int pos) {
		if (pos >= msg.length()) {
			return "";
		}
		return msg.toLowerCase().charAt(pos) + cima(msg, pos + 1);
	}

	public static void main(String[] args) {
		System.out.println(converte("exemplo"));
		System.out.println(converte("exempl"));
	}

}
