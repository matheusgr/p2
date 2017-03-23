package aulaD.recursividade;

public class ImpressãoOrdemRecursao {

	public static void imprime(String msg) {
		imprime(msg, 0);
	}

	private static void imprime(String msg, int pos) {
		if (pos < msg.length()) {
			imprime(msg, pos + 1);
			System.out.print(msg.charAt(pos));
		}
	}

	public static void main(String[] args) {
		imprime("Roma °°?°");
	}

}
