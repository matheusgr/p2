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
public class Agenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String op;
		String[] nomes = new String[1000];
		String[] telefones = new String[1000];
		int cadastros = 0;
		do {
			imprimeMenu();
			op = sc.nextLine();
			switch (op) {
			case "C":
				String nome = sc.nextLine();
				String telefone = sc.nextLine();
				criaCadastro(nomes, telefones, cadastros, nome, telefone);
				cadastros += 1;
				break;
			case "I":
				imprimeCadastros(nomes, telefones, cadastros);
				break;
			case "P":
				String busca = sc.nextLine().trim();
				procura(busca, nomes, telefones, cadastros);
				break;
			case "A":
				int posicao = Integer.parseInt(sc.nextLine());
				apagaCadastro(nomes, telefones, cadastros, posicao);
				cadastros -= 1;
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

	private static void apagaCadastro(String[] nomes, String[] telefones, int cadastros, int posicao) {
		System.arraycopy(telefones, posicao + 1, telefones, posicao, cadastros - posicao);
		System.arraycopy(nomes, posicao + 1, nomes, posicao, cadastros - posicao);
	}

	private static void criaCadastro(String[] nomes, String[] telefones, int cadastros, String nome, String telefone) {
		nomes[cadastros] = nome;
		telefones[cadastros] = telefone;
	}

	private static void imprimeCadastros(String[] nomes, String[] telefones, int cadastros) {
		for (int i = 0; i < cadastros; i++) {
			System.out.println(i + ". NOME: " + nomes[i]);
			System.out.println(i + ". TELEFONE: " + telefones[i]);
		}
	}

	private static void procura(String busca, String[] nomes, String[] telefones, int cadastros) {
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