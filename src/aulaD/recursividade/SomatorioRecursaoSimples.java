package aulaD.recursividade;

public class SomatorioRecursaoSimples {

	public static int soma(int comeco, int fim) {
		if (comeco > fim) {
			return 0;
		}
		return comeco + soma(comeco + 1, fim);
	}

	public static void main(String[] args) {
		System.out.println(soma(1, 10));
	}

}