package aula1_sintaxejava_respostas;

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
public class E9Agenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String op;
		String[] nomes = new String[1000];
		String[] telefones = new String[1000];
		int cadastros = 0;
		do {
			System.out.println("* (C)ADASTRAR NOME/TELEFONE" + System.lineSeparator() + "* (I)MPRIMIR NOMES/TELEFONES"
					+ System.lineSeparator() + "* (P)ROCURAR NOME/TELEFONE" + System.lineSeparator()
					+ "* (A)PAGAR NOME/TELEFONE" + System.lineSeparator() + "* (S)AIR");
			op = sc.nextLine();
			switch (op) {
			case "C":
				nomes[cadastros] = sc.nextLine();
				telefones[cadastros] = sc.nextLine();
				cadastros += 1;
				break;
			case "I":
				for (int i = 0; i < cadastros; i++) {
					System.out.println(i + ". NOME: " + nomes[i]);
					System.out.println(i + ". TELEFONE: " + telefones[i]);
				}
				break;
			case "P":
				String busca = sc.nextLine().trim();
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
				break;
			case "A":
				int posicao = Integer.parseInt(sc.nextLine());
				System.arraycopy(telefones, posicao + 1, telefones, posicao, cadastros - posicao);
				System.arraycopy(nomes, posicao + 1, nomes, posicao, cadastros - posicao);
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

}