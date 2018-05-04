package r.b1.colecoes.slaque;

import java.util.Scanner;

/**
 * Sistema de mensagens com usuários e canais. É possível cadastrar usuários
 * (nome e email) e canais (nome) nesse sistema. Um usuário pode entrar e sair
 * de um canal e mandar mensagens (de uma palavra). O sistema deve poder
 * imprimir os usuários de um canal e o histórico de mensagens desse canal. <br>
 * 
 * USUARIO MATHEUS MATHEUSGR@EXAMPLE.COM<br>
 * CANAL SPLAB<br>
 * ENTRAR SPLAB MATHEUS<br>
 * MENSAGEM SPLAB MATHEUS Oi!<br>
 * SAIR SPLAB MATHEUS<br>
 * IMPRIME SPLAB<br>
 * 
 * @author Matheus Gaudencio
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cmd = sc.nextLine();
		while (cmd.equals("SAIR")) {
			String[] split = cmd.split(" ");
			String acao = split[0];
			switch (acao) {
			case "USUARIO":

				break;
			case "CANAL":

				break;
			case "ENTRAR":

				break;
			case "MENSAGEM":

				break;
			case "IMPRIME":

				break;
			default:
				break;
			}
			cmd = sc.nextLine();
		}
		sc.close();
	}

}