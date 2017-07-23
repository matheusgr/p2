package r.a2.sintaxejava.agenda;

import java.util.Scanner;

/*
operacao = ""

while operacao != "S":
	print("bem vindo a agenda. escolha uma opcao:")
	print("* (C)ADASTRAR NOME/TELEFONE")
	print("* (I)MPRIMIR NOMES/TELEFONES")
	print("* (P)ROCURAR NOME")
	print("* (A)PAGAR CADASTRO")
	print("* (S)AIR")
	# ...
 */
public class AgendaRefatoradoComAtributos {

	private static String[] telefones = new String[1000];
	private static String[] nomes = new String[1000];
	private static int cadastros = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String op;
		do {
			imprimeMenu();
			op = sc.nextLine();
			switch (op) {
			case "C":
				String nome = sc.nextLine();
				String telefone = sc.nextLine();
				criaCadastro(nome, telefone);
				break;
			case "I":
				imprimeCadastros();
				break;
			case "P":
				String busca = sc.nextLine().trim();
				procura(busca);
				break;
			case "A":
				int posicao = Integer.parseInt(sc.nextLine());
				apagaCadastro(posicao);
				break;
			case "S":
				break;
			default:
				System.out.println("comando invalido");
				break;
			}
		} while (!op.equals("S"));
		sc.close();
	}

	private static void apagaCadastro(int posicao) {
		System.arraycopy(telefones, posicao + 1, telefones, posicao, cadastros - posicao);
		System.arraycopy(nomes, posicao + 1, nomes, posicao, cadastros - posicao);
		cadastros -= 1;
	}

	private static void criaCadastro(String nome, String telefone) {
		nomes[cadastros] = nome;
		telefones[cadastros] = telefone;
		cadastros += 1;
	}

	private static void imprimeCadastros() {
		for (int i = 0; i < cadastros; i++) {
			System.out.println(i + ". NOME: " + nomes[i]);
			System.out.println(i + ". TELEFONE: " + telefones[i]);
		}
	}

	private static void procura(String busca) {
		boolean achou = false;
		for (int i = 0; i < cadastros; i++) {
			if (nomes[i].equals(busca)) {
				System.out.println("ACHEI!");
				System.out.println(telefones[i]);
				achou = true;
			}
		}
		if (!achou) {
			System.out.println("cadastro nao encontrado :(");
		}
	}

	private static void imprimeMenu() {
		System.out.println("* (C)ADASTRAR NOME/TELEFONE" + System.lineSeparator() + "* (I)MPRIMIR NOMES/TELEFONES"
				+ System.lineSeparator() + "* (P)ROCURAR NOME/TELEFONE" + System.lineSeparator()
				+ "* (A)PAGAR NOME/TELEFONE" + System.lineSeparator() + "* (S)AIR");
	}

}