package r.a5.restaurante;

import java.util.Scanner;

public class Main {

	/*
	 * CADASTRA codigo valor numPessoas Descricao
	 * EXIBE
	 * ALTERA codigo valor
	 * SAIR
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String linhaUsuario = sc.nextLine();
		Cardapio cardapio = new Cardapio();
		String comando = linhaUsuario.split(" ")[0];
		while (!linhaUsuario.equals("SAIR")) {
			switch (comando) {
			case "SAIR":
				break;
			case "CADASTRA":
				try {
					cadastra(linhaUsuario, cardapio);
				} catch (RuntimeException e) {
					System.out.println("CADASTRO INVALIDO: " + e.getMessage());
				}				
				break;
			case "EXIBE":
				System.out.println(exibe(cardapio));
				break;
			case "ALTERA":
				altera(linhaUsuario, cardapio);
				break;
			default:
				System.out.println("COMANDO INVALIDO!");
				break;
			}
			linhaUsuario = sc.nextLine();
			comando = linhaUsuario.split(" ")[0];
		}
	}

	private static void altera(String linhaUsuario, Cardapio cardapio) {
		Scanner sc = new Scanner(linhaUsuario);
		sc.next();
		String codigo = sc.next();
		double valor = sc.nextDouble();
		cardapio.alteraValor(codigo, valor);
	}

	private static String exibe(Cardapio cardapio) {
		return cardapio.toString();
	}

	/*
	 * CADASTRA codigo valor numPessoas Descricao
	 */
	private static void cadastra(String linhaUsuario, Cardapio cardapio) {
		Scanner sc = new Scanner(linhaUsuario);
		sc.next();
		String codigo = sc.next();
		double valor = sc.nextDouble();
		int numPessoas = sc.nextInt();
		String descr = sc.nextLine();
		cardapio.cadastraRefeicao(codigo, valor, numPessoas, descr);
	}

}
