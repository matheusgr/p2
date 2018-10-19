package r.a4.classes_sortidas.banco;
import java.util.Scanner;

public class Malote {

	public static void main(String[] args) {
		int[] entradas = new int[100];
		int qtd = 0;
		Scanner sc = new Scanner(System.in);
		int entradaLida = sc.nextInt();
		while (entradaLida != 0 && qtd < 100) {
			entradas[qtd] = entradaLida;
			qtd += 1;
			entradaLida = sc.nextInt();
		}
		double media = media(entradas, qtd);
		int soma = soma(entradas, qtd);
		int acima = acimaDaMedia(entradas, qtd, media);
		System.out.println(soma + " " + media + " " + acima);
		System.out.printf("%d %.2f %d", soma, media, acima);
		sc.close();
	}

	private static int acimaDaMedia(int[] entradas, int qtd, double media) {
		int acima = 0;
		for (int i = 0; i < qtd; i++) {
			int j = entradas[i];
			if (j > media) {
				acima += 1;
			}
		}
		return acima;
	}

	private static int soma(int[] entradas, int qtd) {
		int soma = 0;
		for (int i = 0; i < qtd; i++) {
			int j = entradas[i];
			soma += j;
		}
		return soma;
	}

	private static double media(int[] entradas, int qtd) {
		return (1.0 * soma(entradas, qtd)) / qtd;
	}

}
