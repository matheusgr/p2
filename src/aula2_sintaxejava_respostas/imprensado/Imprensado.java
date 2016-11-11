package aula2_sintaxejava_respostas.imprensado;

import java.util.Scanner;

/*
 * No jogo do imprensado, um número aleatório X é escolhido
 * e o jogador deve imprensar esse número.
 * 
 * Para isso, a cada rodada o jogador deve tentar adivinhar
 * o número e o computador deve dizer se o número escolhido
 * pelo jogador é maior ou menor que o número escolhido
 * pelo computador.
 * 
 * Se o jogador escolher os números X+1 e X-1, ele ganha.
 * Se em algum momento o jogador escolher o número X, ele
 * perde.
 * 
 * MENU:
 * 1) Iniciar Partida
 * 2) Historico
 * 3) Sair
 * 
 * Sua escolha? 1
 * 
 * Ok, escolhi um numero entre 1 e 100.
 * 
 * Chute? 23
 * Menor
 * Chute? 20
 * Maior
 * Chute? 21
 * Voce ganhou! (22)
 * 
 * 1) Iniciar Partida
 * 2) Historico
 * 3) Sair 
 * 
 * Sua escolha? 1
 * 
 * Ok, escolhi um numero entre 1 e 100.
 * 
 * Chute? 42
 * Voce perdeu! (42)
 * 
 * 1) Iniciar Partida
 * 2) Historico
 * 3) Sair 
 * 
 * Sua escolha? 2
 * 
 * - 1 derrota
 * - 1 vitoria
 * 
 * 1) Iniciar Partida
 * 2) Historico
 * 3) Sair 
 * 
 * Sua escolha? 3
 * 
 * Xau!
 */
public class Imprensado {

	public static final String NL = System.lineSeparator();
	private static int vitorias = 0;
	private static int derrotas = 0;

	public static void main(String[] args) {
		boolean loop = true;
		Scanner sc = new Scanner(System.in);
		while (loop) {
			imprimeMenu();
			String escolha = capturaEntrada(sc);
			switch (escolha) {
			case "1":
				boolean vitoria = jogar(sc);
				acrescentarHistorico(vitoria);
				break;
			case "2":
				imprimirHistorico();
				break;
			case "3":
				loop = false;
				break;
			default:
				break;
			}
		}
		sc.close();
	}

	private static void imprimirHistorico() {
		System.out.println("Vitorias " + vitorias);
		System.out.println("Derrotas " + derrotas);
	}

	private static void acrescentarHistorico(boolean vitoria) {
		if (vitoria) {
			vitorias++;
		} else {
			derrotas++;
		}
	}

	private static boolean jogar(Scanner sc) {
		int valor = 1 + (int) (Math.random() * 100);
		int escolhaAtual = -1;
		int escolhaMaior = 101;
		int escolhaMenor = -1;
		while (true) {
			System.out.print("Chute? ");
			escolhaAtual = Integer.parseInt(sc.nextLine());
			if (valor == escolhaAtual) {
				System.out.println("Voce perdeu! " + valor);
				return false;
			}
			if (escolhaAtual > valor && escolhaAtual < escolhaMaior) {
				escolhaMaior = escolhaAtual;
			}
			if (escolhaAtual < valor && escolhaAtual > escolhaMenor) {
				escolhaMenor = escolhaAtual;
			}
			if (escolhaMaior == valor + 1 && escolhaMenor == valor - 1) {
				System.out.println("Voce ganhou! " + valor);
				return true;
			}
			if (escolhaAtual > valor) {
				System.out.println("Menor");
			}
			if (escolhaAtual < valor) {
				System.out.println("Maior");
			}
		}
	}

	private static String capturaEntrada(Scanner sc) {
		String entrada = sc.nextLine().trim();
		return entrada;
	}

	private static void imprimeMenu() {
		System.out.print("1) Iniciar Partida" + NL + "2) Historico" + NL + "3) Sair" + NL + NL + "Sua Escolha? ");
	}

}
